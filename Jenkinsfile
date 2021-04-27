timestamps {
    node {
        stage('Checkout') {
            checkout scm
        }

        if (BRANCH_NAME == 'master') {
            stage('Build') {
                jobDsl(additionalClasspath:  removedJobAction: 'DELETE', removedViewAction: 'DELETE',
                        targets: 'folders.groovy', unstableOnDeprecation: true)
            }
        }
    }
}
