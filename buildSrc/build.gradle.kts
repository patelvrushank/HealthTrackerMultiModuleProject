import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`


}

repositories {
    google()
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
//    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0")
//    implementation("com.android.tools.build:gradle:8.7.3")
}


val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "11"
}
configurations.all {
    resolutionStrategy {
        force("org.jetbrains:annotations:23.0.0")
    }
}