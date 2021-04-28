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
multibranchPipelineJob('Deployments2/example') {
                branchSources {
                  git {
                    id('1234567wefewf89') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
multibranchPipelineJob('Deployments3/example') {
                branchSources {
                  git {
                    id('12345678qwqwr9') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
multibranchPipelineJob('Deployments4/example') {
                branchSources {
                  git {
                    id('12345678ewfwefew9') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}

