package org.projecttl.program.list

import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*
import kotlin.collections.ArrayList

class Working {

    var running = true
    var array = ArrayList<String>()
    var extension = ".pel"

    fun onEnable() {
        val scanner = Scanner(System.`in`)
        var command: String

        while (running) {
            println("<List> 커맨드를 입력해 주십시오. 커맨드를 모르신다면 help 명령어를 실행 시켜 주십시오.")
            command = scanner.nextLine()

            when (command) {
                "help" -> {
                    println("<List> 커맨드 목록: create, remove, load, save, check, version, exit")

                    // Command Description
                    println("create: 변수를 생성합니다.")
                    println("remove: 변수를 삭제합니다.")
                    println("check: 변수를 확인합니다.")
                    println("load: 파일을 불러옵니다.")
                    println("save: 파일을 저장합니다.")
                    println("version: 프로그램의 버전을 확인합니다.")
                    println("exit: 프로그램을 종료합니다.")
                }

                "create" -> {
                    // TODO
                    println("<List> 단어를 입력해 주십시오.")
                    val scannedTitle = scanner.nextLine()
                    array.add(scannedTitle)

                    println("<List> 입력된 단어들: $array")
                }

                "remove" -> {
                    println("<List> 삭제할 변수이름을 입력해 주세요. 변수: $array")
                    val text = scanner.nextLine()
                    array.remove(text)
                    println("<List> ${text}가 삭제 되었습니다.")
                }

                "check" -> {
                    println("<List> 지금까지 입력된 단어들: $array")
                }

                "load" -> {
                    println("<List> 불러올 파일의 경로를 입력하여 주십시오.")
                    val loadPath = scanner.nextLine()

                    try {
                        val read = FileReader(loadPath)
                        array.add(read.readText())
                        println("<List> 파일을 불러왔습니다.")
                    } catch (exception: Exception) {
                        exception.printStackTrace()
                    }
                }

                "save" -> {
                    println("<List> 저장될 파일 경로를 입력해 주십시오.")
                    val path = scanner.nextLine()
                    println("<List> 파일 경로: $path")

                    println("<List> 파일 이름을 입력해 주십시오.")
                    val fileName = scanner.nextLine()
                    println("<List> 파일 이름: ${fileName + extension}")

                    try {
                        Files.write(Paths.get(path + fileName + extension), array.toList(), StandardOpenOption.CREATE)
                        println("<List> 파일이 저장되었습니다.")
                    } catch (exception: Exception) {
                        exception.printStackTrace()
                    }
                }

                "version" -> {
                    println("<List> 이 플러그인의 버전은 0.01b 입니다.")
                }

                "exit" -> {
                    println("<List> 종료 하시겠습니까? yes or no")
                    val exit = scanner.nextLine()

                    when (exit) {
                        "yes" -> {
                            println("<List> 프로그램을 종료합니다.")
                            running = false
                            break
                        }

                        "no" -> {
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