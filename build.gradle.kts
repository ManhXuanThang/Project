buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Libs.kotlinVersion}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Libs.navigationVersion}")
//        classpath("com.google.gms:google-services:4.3.4")
//        classpath("com.google.firebase:firebase-crashlytics-gradle:2.3.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Libs.daggerHiltVersion}")
//        classpath("com.google.firebase:perf-plugin:1.3.2")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
