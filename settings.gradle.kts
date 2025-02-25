dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "gradle-dependency-propagation-sandbox"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("app1")
project(":app1").projectDir = file("projects/app1")

include("app2")
project(":app2").projectDir = file("projects/app2")

include("app-base")
project(":app-base").projectDir = file("projects/app-base")

include("test-base")
project(":test-base").projectDir = file("projects/test-base")
