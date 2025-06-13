    // build.gradle.kts (Project Level)
// Top-level build file where you can add configuration options common to all sub-projects/modules.

// build.gradle.kts (Project Level - dengan Version Catalog)
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false // PENTING
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}

// Tambahkan blok ini jika belum ada, untuk menggunakan version catalog (libs)
// Jika Anda tidak menggunakan version catalog, referensi plugin akan seperti yang sebelumnya:
// id("com.android.application") version "8.3.2" apply false // Sesuaikan versi
// id("org.jetbrains.kotlin.android") version "1.9.22" apply false // Sesuaikan versi
// id("com.google.dagger.hilt.android") version "2.51.1" apply false // Sesuaikan versi
// id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false // Sesuaikan versi

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
