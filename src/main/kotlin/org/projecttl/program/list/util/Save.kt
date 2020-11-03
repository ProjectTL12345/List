package org.projecttl.program.list.util

import org.projecttl.program.list.Main
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*

class Save {

    fun onSave() {
        println("<List> 저장될 파일 경로를 입력해 주십시오.")
        val scanner = Scanner(System.`in`)

        val path = scanner.nextLine()
        println("<List> 파일 경로: $path")

        println("<List> 파일 이름을 입력해 주십시오.")
        val fileName = scanner.nextLine()
        println("<List> 파일 이름: ${fileName + Main.extension}")

        try {
            Files.write(
                Paths.get(path + fileName + Main.extension),
                Main.array.toList(),
                StandardOpenOption.CREATE
            )
            println("<List> 파일이 저장되었습니다.")
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }
}