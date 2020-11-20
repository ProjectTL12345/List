package org.projecttl.program.list.util

import org.projecttl.program.list.ListProgram
import java.util.*

class Create {

    fun onCreate() {
        println("<List> 단어를 입력해 주십시오.")
        val scanner = Scanner(System.`in`)
        val scannedTitle = scanner.nextLine()

        ListProgram.array.add(scannedTitle)
        println("<List> 입력된 단어들: ${ListProgram.array}")
    }
}