
internal object Versions {
    const val kotlinVersion = "1.3.72"
    const val coreKtxVersion = "1.3.0"
    const val appCompatVersion = "1.1.0"
    const val jUnitVersion = "4.12"
    const val jUnitExtAndroidVersion = "1.1.1"
    const val koinVersion = "2.1.1"
    const val ktLintVersion = "0.33.0"
}

object Dependencies {
    const val kotlin        = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coreKtx       = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat     = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val koin          = "org.koin:koin-core:${Versions.koinVersion}"
    const val koinAndroid   = "org.koin:koin-android:${Versions.koinVersion}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"
    const val ktLint        = "com.pinterest:ktlint:${Versions.ktLintVersion}"
}

object TestDependencies {
    const val jUnit             = "junit:junit:${Versions.jUnitVersion}"
    const val jUnitExtAndroid   = "androidx.test.ext:junit:${Versions.jUnitExtAndroidVersion}"
}