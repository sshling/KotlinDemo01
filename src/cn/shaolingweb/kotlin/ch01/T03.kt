package cn.shaolingweb.kotlin.ch01

//1. 参数类型、函数返回类型定义方法
fun add(a:Int ,b:Int):Int{
    return a+b;
}

fun main(args: Array<String>) {
    println(add(1,1))
    println(add2(1,1))
    myPrint(1,3)
    myPrint2(1,4)
    myPrint3(1,5)
}
//2.简化函数体：表达式赋值函数体
fun add2(a: Int, b: Int) = a + b

//3. 无返回类型的函数
fun myPrint(a:Int,b:Int):Unit{ //返回空，Unit,可省略不写
    println(a+b)
}

fun myPrint2(a:Int,b:Int){ //返回空，Unit,可省略不写
    println(a+b)
}
//字符串模板: String template ,变量用$  ,表达式用+花括号
fun myPrint3(a:Int,b:Int){
    println("$a+$b=${a + b}")
}