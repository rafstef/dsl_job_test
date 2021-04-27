def folders = readFileFromWorkspace('folders.groovy')
pipeline {
  agent any
  stages {
    stage('Create Folders') {
      steps {
        script {
          groovyCommand('folders')
        }
      }
    }
  }
}
