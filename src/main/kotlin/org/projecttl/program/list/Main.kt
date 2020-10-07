package org.projecttl.program.list

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("List Program: 0.01b")
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