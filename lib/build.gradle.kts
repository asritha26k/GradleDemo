plugins {
    // Apply the Java plugin
    java
    // Apply the Java Library plugin (for api/implementation separation)
    `java-library`
    // SonarQube plugin
    id("org.sonarqube") version "7.0.1.6134"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.0")

    // Example dependencies
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

sonarqube {
    properties {
    property("sonar.projectName", "GradleDemo")
        property("sonar.projectKey", "asritha26k_GradleDemo")
        property("sonar.organization", "asritha26k")
        property("sonar.host.url", "https://sonarcloud.io")
        // If you use token, uncomment and set your token in gradle.properties
        // property("sonar.login", "YOUR_SONAR_TOKEN")
    }
}
