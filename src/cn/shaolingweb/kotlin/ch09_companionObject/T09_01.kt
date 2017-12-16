package cn.shaolingweb.kotlin.ch09_companionObject

/*
伴生对象及字节码内幕
 */

/*
接口:
 */
interface A{
    //fun method1() //接口中方法可以只有声明
    fun method(){//接口中方法可以有实现
        println("method2")
    }
}
/*
Ｃ实现接口
 */
class C:A{//接口没有括号"()"
    //已继承method2()

    //覆写
    override fun method() {
        super.method()
    }
}

fun main(args: Array<String>) {
    var c=C()
    c.method()
}