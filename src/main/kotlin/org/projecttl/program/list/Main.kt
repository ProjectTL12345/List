package org.projecttl.program.list

import org.projecttl.program.list.util.*
import java.util.*
import kotlin.collections.ArrayList

class Main {

    companion object {

        var running = true
        var array = ArrayList<String>()
        var extension = ".txt"
        var version = "1.0v"

        @JvmStatic
        fun main(args: Array<out String>) {
            println("List Program: $version")
            println("Made by Project_TL")
            try {
                Thread.sleep(1000)

            } catch (exception: Exception) {
                exception.printStackTrace()
            }

            onStart()
        }

        private fun onStart() {

            val scanner = Scanner(System.`in`)
            var command: String

            while (running) {
                println("<List> 커맨드를 입력해 주십시오. 커맨드를 모르신다면 help 명령어를 실행 시켜 주십시오.")
                command = scanner.nextLine()

                when (command) {
                    "help" -> {
                        val help = Help()
                        help.onHelp()
                    }

                    "create" -> {
                        val create = Create()
                        create.onCreate()
                    }

                    "remove" -> {
                        val remove = Remove()
                        remove.onRemove()
                    }

                    "check" -> {
                        println("<List> 지금까지 입력된 단어들: $array")
                    }

                    "load" -> {
                        val load = Load()
                        load.onLoad()
                    }

                    "save" -> {
                        val save = Save()
                        save.onSave()
                    }

                    "version" -> {
                        println("<List> 이 플러그인의 버전은 $version 입니다.")
                    }

                    "exit" -> {
                        println("<List> 종료 하시겠습니까? yes or no")
                        var exit = scanner.nextLine()

                        when (exit) {
                            "yes" -> {
                                println("<List> 프로그램을 종료합니다.")
                                running = false
                                break
                            }

                            "no" -> {
                                continue
                            }
                        }
                    }

                    else -> {
                        println("<List> 알 수 없는 커맨드 입니다. 입력된 커맨드: $command")
                    }
                }
            }
        }
    }
}