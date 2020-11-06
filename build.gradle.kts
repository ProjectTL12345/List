plugins {
    kotlin ("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

group = properties["programGroup"]!!
version = properties["programVersion"]!!

repositories {
    mavenCentral()
}

dependencies {
    implementation (kotlin("stdlib-jdk8"))
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

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
            attributes["Main-Class"] = "org.projecttl.program.list.Main"
        }

        from (
            shade.map {
                if (it.isDirectory)
                    it

                else
                    zipTree(it)
            }
        )
    }
}