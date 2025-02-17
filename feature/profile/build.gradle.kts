plugins {
    alias(libs.plugins.workshop.android.feature)
}

android {
    namespace = "yandex.practicum.conventionsample.bookstore"
}

dependencies {
    implementation(project(":core:analytics"))

    implementation(library("hilt.android"))
    ksp(library("hilt.compiler"))
}