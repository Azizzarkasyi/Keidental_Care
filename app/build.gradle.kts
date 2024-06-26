plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")

}

android {
    namespace = "com.example.fantasticten"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fantasticten"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures{
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("io.github.chaosleung:pinview:1.4.4")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-core:21.1.1")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.github.denzcoskun:ImageSlideshow:0.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Socket.io
    implementation("io.socket:socket.io-client:2.0.0")
    implementation("com.google.code.gson:gson:2.8.8")

    implementation("com.google.firebase:firebase-firestore:21.4.3")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")


    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    implementation("androidx.fragment:fragment-ktx:1.6.2")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
}
