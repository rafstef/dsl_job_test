node {
    jobDsl scriptText: 'job("CreateFolders")'

    jobDsl targets: ['folders.groovy', 'jobs/common.groovy'].join('\n'),
           removedJobAction: 'DELETE',
           removedViewAction: 'DELETE',
           lookupStrategy: 'SEED_JOB'
}
