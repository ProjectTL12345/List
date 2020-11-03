package org.projecttl.program.list.util

import org.projecttl.program.list.Main
import java.io.FileReader
import java.util.*

class Load {

    fun onLoad() {
        println("<List> 불러올 파일의 경로를 입력하여 주십시오.")
        val scanner = Scanner(System.`in`)
        val loadPath = scanner.nextLine()

        try {
            val read = FileReader(loadPath)
            Main.array.add(read.readText())
            println("<List> 파일을 불러왔습니다.")
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }
}