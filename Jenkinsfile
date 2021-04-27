pipeline {
  agent any
  stages {
    stage('Create Folders') {
      steps {
        script {
          jobDslFromFile('jenkinsSeedJob/folders.groovy')
        }
      }
    }
  }
}
