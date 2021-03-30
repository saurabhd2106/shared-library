def call() {
    node {
        sh '''
            git version
            python3 --version
            docker --version
        '''
    }
}