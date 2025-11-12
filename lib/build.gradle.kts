plugins {
    id("org.sonarqube") version "7.0.1.6134"
}

sonarqube {
    properties {
        property("sonar.projectKey", "asritha26k_GradleDemo")
        property("sonar.organization", "asritha26k")
    }
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
