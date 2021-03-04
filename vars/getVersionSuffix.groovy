def call(Map config) {
    node {
        if (config.isReleaseCandidate) {
        return config.rcNumberr
        } else {
        return config.rcNumber + '+ci.' + env.BUILD_NUMBER
        }
    }
}