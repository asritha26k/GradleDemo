plugins {
    id("java-library")
    id("org.sonarqube") version "4.4.0.5187" // compatible with Gradle 8+ and Kotlin DSL
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.0")

    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:33.0.0-jre")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.test {
    useJUnitPlatform()
}
