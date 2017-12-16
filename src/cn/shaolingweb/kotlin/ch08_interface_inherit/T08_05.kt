package cn.shaolingweb.kotlin.ch08_interface_inherit

open class MyParent3{
    open fun method(){//　open 可被覆写
        println("parent method")
    }
    /*
    对这个属性的get()方法
    val　不可变
     */
    open val name:String get()="parent"
}

class MyChild3():MyParent3(){
    /*
    1. 覆写了父类的方法，还调用了父类的方法
    2. 覆写了父类的属性,还调用了父类的属性
     */
    override fun method() {
        println("child method")
        super.method()//不必放到第一行
    }
    override val name:String get()=super.name+" and child"
}

fun main(args: Array<String>) {
    var child3=MyChild3()
    child3.method()
    println(child3.name)
}
/*
java默认是包级别,kotlin默认是public
 */