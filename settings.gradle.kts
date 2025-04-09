pluginManagement {
    repositories {

        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }

}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
//    versionCatalogs{
//        create("libs"){
//            from(files("gradle/libs.version.toml"))
//        }
//    }



}


rootProject.name = "HealthTracker"
include(":app")
include(":core")
include(":onBoarding")
include(":tracker")
include(":onBoarding:onBoarding_domain")
include(":onBoarding:onBoarding_presentation")
include(":tracker:tracker_data")
include(":tracker:tracker_domain")
include(":tracker:tracker_presentation")


include(":core_ui")
