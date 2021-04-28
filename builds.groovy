multibranchPipelineJob('Deployments1/example1') {
                branchSources {
                  git {
                    id('123456789') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
multibranchPipelineJob('Deployments2/example2') {
                branchSources {
                  git {
                    id('1234567wefewf89') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
multibranchPipelineJob('Deployments3/example3') {
                branchSources {
                  git {
                    id('12345678qwqwr9') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}
multibranchPipelineJob('Deployments4/example4') {
                branchSources {
                  git {
                    id('12345678ewfwefew9') // IMPORTANT: use a constant and unique identifier
                      remote('https://github.com/jenkinsci/job-dsl-plugin.git')
                      credentialsId('github-ci')
                      includes('JENKINS-*')
                  }
             }
}

