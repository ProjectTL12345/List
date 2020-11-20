package org.projecttl.program.list.util

import org.projecttl.program.list.ListProgram
import java.util.*

class Remove {

    fun onRemove() {
        println("<List> 삭제할 변수이름을 입력해 주세요. 변수: ${ListProgram.array}")
        val scanner = Scanner(System.`in`)
        val text = scanner.nextLine()

        ListProgram.array.remove(text)
        println("<List> ${text}가 삭제 되었습니다.")
    }
}