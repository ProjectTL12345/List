package org.projecttl.program.list.util

import org.projecttl.program.list.ListProgram

@Suppress("SENSELESS_NULL_IN_WHEN")
class Check {

    fun onCheck() {
        when (ListProgram.array) {
            null -> {
                println("<List> 입력된 단어가 없습니다.")
            }

            else -> {
                println("<List> 지금까지 입력된 단어들: ${ListProgram.array}")
            }
        }
    }
}