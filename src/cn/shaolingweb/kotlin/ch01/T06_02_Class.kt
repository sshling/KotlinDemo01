package cn.shaolingweb.kotlin.ch01

/*
看起来跟Java一样，其实不一样
1. 没有类体，花括号可以省略，但这样没意义
2. 类没有任何修饰符，就是public
3. 不要去 类名跟文件名相同

在Kotlin中，一个类可以有一个primary构造方法及一个或多个secodary构造方法
--主、从构造方法
-- primary构造方法是类头(class header)的一部分，位于类后面，可有若干参数
-- 若primary构造方法没有任何注解或可见性关键字修饰，那么constructor关键字可省略
--- 注解
--- 可见性
-- primary构造方法没有任何代码
 */
class MyClass constructor(username:String){//一个构造方法，参数为字符串
    private val username=username.toUpperCase()//构造方法传递来的，省略了 :String
    init {//初始化代码块，给类成员变量赋初始值的，可访问构造方法的参数
        println("init...$username")
    }

}
class MyClass2(username:String){//一个构造方法，参数为字符串
}

fun main(args: Array<String>) {
    //实例化，没有new
    var myObj=MyClass("tom")
    println(myObj)
}
