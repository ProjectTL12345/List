package org.projecttl.program.list

class Main {
    companion object {

        var version = "1.0v"

        @JvmStatic
        fun main(args: Array<String>) {
            println("List Program: $version")
            println("Made by Project_TL")
            try {
                Thread.sleep(1000)
            } catch (exception: Exception) {
                exception.printStackTrace()
            }

            val working = Working()
            working.onEnable()
        }
    }
}