package cn.shaolingweb.kotlin.ch07_Class_secondary

/*
T07_01.kt 是传统的写法，
还有简便写法
 */

class Student(
              private val username:String,//常量,
            // val或var修饰，当做类的成员变量，可以${xx}　访问成员变量的值
              private val age:Int,//常量
              private var address:String//变量
        ){
    fun printInfo(){
        //.sout
        println("useranme=${username} ,age=${age} ,address=${address}")
    }
}

/*
constructor 之前有　注解或访问修饰符.

如果构造方法有注解或可见性修饰符，那么constructor关键字
就是不能省略的，且它位于修饰符后面
 */
class Student2 private constructor(username:String){
}

/*
参数有默认值
val表示属性有默认值

在JVM上，如果类似primary构造方法的所有参数都拥有默认值，
那么kotlin编译器就会为这个类生成一个不带参数的构造方法,
这个不带参数的构造方法会使用这些参数的默认值,
这样做的目的在于跟Spring等框架更好地集成.
 */
class Student3(username: String="zhangsan")













