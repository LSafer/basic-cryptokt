plugins {
    `maven-publish`

    kotlin("multiplatform") version libs.versions.kotlin
}

group = "net.lsafer"
version = "1.0.0-SNAPSHOT"

tasks.wrapper {
    gradleVersion = "8.2.1"
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

kotlin {
    jvm {
        withJava()
    }
    js {
        binaries.library()
        browser()
        nodejs()
    }
    sourceSets {
        commonMain {
            dependencies {
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        jvmMain {
            dependencies {
                implementation("at.favre.lib:bcrypt:0.9.0")
                implementation("com.google.crypto.tink:tink:1.10.0")
            }
        }
        jsMain {
            dependencies {
            }
        }
    }
}
