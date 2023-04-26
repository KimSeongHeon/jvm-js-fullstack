pluginManagement {
    resolutionStrategy {
        eachPlugin {
            println("::: each Plugin ${this.requested.id.id}")
            if (requested.id.id == "org.jetbrains.kotlin.multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "shoppinglist"

