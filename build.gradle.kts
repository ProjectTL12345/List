plugins {
    kotlin ("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    `maven-publish`
}

group = properties["programGroup"]!!
version = properties["programVersion"]!!

repositories {
    mavenCentral()
}

dependencies {
    implementation (kotlin("stdlib-jdk8"))
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    compileTestJava {
        options.encoding = "UTF-8"
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    jar {
        manifest {
            attributes["Main-Class"] = "org.projecttl.program.list.ListProgram"
        }
    }

    create<Jar>("sourceJar") {
        archiveClassifier.set("source")
        from(sourceSets["main"].allSource)
    }

    shadowJar {
        from("sourceJar")
    }
}

publishing {
    publications {
        create<MavenPublication>("List") {
            artifact(tasks["sourceJar"])
            from(components["java"])
        }
    }
}