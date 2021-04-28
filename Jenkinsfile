import javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration
import jenkins.model.GlobalConfiguration

// disable Job DSL script approval
GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).useScriptSecurity=false
GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).save()


pipeline {
    agent any
    stages {
        stage('Folder') {
            steps {
    

              jobDsl scriptText: 'job("CreateFolders")'

              jobDsl targets: ['folders.groovy'].join('\n'),
                removedJobAction: 'DELETE',
                removedViewAction: 'DELETE',
                lookupStrategy: 'SEED_JOB'

            }
        }
        stage('Folder') {
            steps {
              multibranchPipelineJob('Deployments1/example') {
                branchSources {
                  git {
                    id('123456789') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
    
   }
   post {
   // Clean after build
   always {
     cleanWs(cleanWhenNotBuilt: false,
     deleteDirs: true,
     disableDeferredWipeout: true,
     notFailBuild: true,
     patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
     [pattern: '.propsfile', type: 'EXCLUDE']])
   }
  }
}



