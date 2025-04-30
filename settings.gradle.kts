pluginManagement.repositories {
    gradlePluginPortal()
    maven("https://eldonexus.de/repository/maven-public/")
}

rootProject.name = "minestom"

include("testing")
include("code-generators")
include("jmh-benchmarks")
include("jcstress-tests")

include("demo")

