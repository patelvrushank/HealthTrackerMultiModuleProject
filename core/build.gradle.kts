plugins {
    //alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.android.library)
    //alias(libs.plugins.hilt.plugin)
    kotlin("kapt")
}


android {
    namespace = "com.vrushank.core"
    compileSdk = 35
    defaultConfig {
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
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


    //implementation(libs.dagger.android.compiler)
   // kapt(libs.dagger.android.compiler)

    implementation(libs.coil)
    implementation(libs.dagger.android){
        exclude(group = "com.google.dagger", module = "dagger-spi")
    }
    kapt(libs.dagger.android.compiler)
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    //androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)



}




