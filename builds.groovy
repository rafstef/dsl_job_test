multibranchPipelineJob('Deployments1/example') {
                branchSources {
                  git {
                    id('123456789') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
