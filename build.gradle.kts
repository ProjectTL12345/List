plugins {
    kotlin ("jvm") version "1.5.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    `maven-publish`
}

group = properties["programGroup"]!!
version = properties["programVersion"]!!

repositories {
    mavenCentral()
}

dependencies {
    implementation (kotlin("stdlib"))
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    compileTestJava {
        options.encoding = "UTF-8"
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
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
        archiveBaseName.set(project.name)
        archiveVersion.set("")
        archiveClassifier.set("")
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
