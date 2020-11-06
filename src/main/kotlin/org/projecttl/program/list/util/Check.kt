package org.projecttl.program.list.util

import org.projecttl.program.list.Main

class Check {

    fun onCheck() {
        if (Main.array == null) {
            println("<List> 입력된 단어가 없습니다.")
        }

        else {
            println("<List> 지금까지 입력된 단어들: ${Main.array}")
        }
    }
}