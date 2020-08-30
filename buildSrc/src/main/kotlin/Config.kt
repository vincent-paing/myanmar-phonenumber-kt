object BuildConfig {
    private const val versionMajor = 1
    private const val versionMinor = 0
    private const val versionPatch = 2
    private const val versionBuild = 0

    const val group = "com.aungkyawpaing.mmphonenumber"

    const val artifactName = "mmphonenumber"

    const val description = "Port of myanmar-phonenumber written in Kotlin to check valid myanmar mobile numbers, get mobile operator name, sanitize mobile numbers and get mobile network types."

    const val license = "Apache-2.0"
    const val license_url = "http://www.apache.org/licenses/LICENSE-2.0.txt"

    const val versionName =
        "$versionMajor.$versionMinor.$versionPatch"
    const val versionCode =
        versionMajor * 1000000 + versionMinor * 10000 + versionPatch * 100 + versionBuild

}

object CommonLibs {
    const val bintray_plugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4"

    const val junit = "junit:junit:4.12"
}