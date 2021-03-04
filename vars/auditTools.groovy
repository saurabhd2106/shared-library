def call() {
    node {
        powershell '''
            git version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }
}