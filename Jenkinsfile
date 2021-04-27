pipeline {
  def folders = readFileFromWorkspace('folders.groovy')
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
