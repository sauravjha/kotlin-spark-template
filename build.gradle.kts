
plugins {
    application
    kotlin("jvm") version "1.3.72"
}

version = "1.0.2"
group = "org.sample"

application {
    mainClass.set("org.sample.MainKt")
}

repositories {
    mavenCentral()
    jcenter()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.sparkjava:spark-core:2.5.4")
    implementation("org.slf4j:slf4j-simple:1.7.30")
}
