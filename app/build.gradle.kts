plugins {
   alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
   alias(libs.plugins.kotlin.compose)

    alias(libs.plugins.hilt.plugin)
    //id("dagger.hilt.android.plugin")

    kotlin("kapt")
}

android {
    namespace = "com.vrushank.healthtracker"
    compileSdk = 35

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.coil)
    implementation(libs.dagger.android){
        exclude(group = "com.google.dagger", module = "dagger-spi")
    }
    //implementation(libs.dagger.android.compiler)
    kapt(libs.dagger.android.compiler)
   // implementation(libs.dagger)
    //implementation(libs.google.dagger.android)
    //implementation(libs.dagger.compiler)
    //implementation(libs.com.google.devtools.ksp.gradle.plugin)
   // kapt(libs.dagger.android.compiler)
    implementation(libs.androidx.navigation.compose)
    //kapt(libs.dagger.android.compiler)
    implementation(libs.retro.fit)
    implementation(libs.retro.fit.moshi)
    implementation(libs.okHttp)
    implementation(libs.okHttpLoggingInterceptor)
   // implementation(libs.moshiCodegen)
    implementation(libs.roomRuntime)
    //implementation(libs.roomCompiler)
    kapt(libs.roomCompiler)
    implementation(libs.roomKtx)
    //kapt("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")
    kapt(libs.moshi)
   // kapt("com.google.dagger:dagger-android-processor:2.56.2")
    implementation(libs.androidx.navigation.common)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    //androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))

    implementation(project(Modules.onboardingPresentation))
    implementation(project(Modules.onboardingDomain))
    implementation(project(Modules.trackerPresentation))
    implementation(project(Modules.trackerDomain))
    implementation(project(Modules.trackerData))

}
