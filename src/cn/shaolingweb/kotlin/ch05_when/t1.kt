package cn.shaolingweb.kotlin.ch05_when

fun main(args: Array<String>) {
    println(convert2Uppercase("hello wolrd"))
}

fun convert2Uppercase(str:Any):String?{
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}