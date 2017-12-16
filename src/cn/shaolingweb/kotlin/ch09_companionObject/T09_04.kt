package cn.shaolingweb.kotlin.ch09_companionObject

/*
object declaration,对象声明
后续介绍相关的对象表达式
 */

/*
kotlin直接定义一个对象，和类定义很相似.

*/
object MyObj{//声明了一个对象
    fun method(){
        println("method")
    }
}

fun main(args: Array<String>) {
    MyObj.method()//对象可以直接调用
}

