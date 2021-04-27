timestamps {
    node {
        stage('Checkout') {
            checkout scm
        }

        if (BRANCH_NAME == 'master') {
            stage('Build') {
                jobDsl(removedJobAction: 'DELETE', removedViewAction: 'DELETE',
                        targets: 'folders.groovy', unstableOnDeprecation: true)
            }
        }
    }
}
