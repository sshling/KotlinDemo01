package cn.shaolingweb.kotlin.ch01

import java.util.function.Consumer

fun main(args: Array<String>) {
    //1. 定义、遍历 List
    val list: List<String> = listOf("hello", "world")
    for (item in list) {
        println(item)
    }
    println("------------- 2. 函数式遍历")
    //参数是Consumer
    list.forEach(Consumer { println(it) })//it是语法糖，当前遍历到的元素
    println("------------- 3. 方法引用")
    list.forEach(System.out::println)
    //1,2,3 -> Kotlin相比Java的臃肿显得异常简洁，但是Java 100%互操作
}
