package yandex.workshop.conventions
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension

fun Project.library(alias: String) =
    extensions.getByType(VersionCatalogsExtension::class.java).named("libs").findLibrary(alias).get()
