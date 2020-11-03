package org.projecttl.program.list.util

class Help {

    fun onHelp() {
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
}