android {
    buildTypes {
        debug {
            applicationIdSuffix ".debug"
            versionNameSuffix "-DEBUG"
        }
        release {
            minifyEnabled false
        }
    }
}
