package cn.shaolingweb.kotlin.ch09_companionObject

import cn.shaolingweb.kotlin.ch06_range_stringEscape_Class.MyClass

/*
伴生对象, companion object.
在kotlin中，与Java不同的是，类是没有static方法.
在大多数情况下,kotlin推荐的做法是使用包级别的函数来作为静态方法

kotlin会将包级别的函数当做静态方法来看待.

伴生对象:这个对象的声明，位于一个类中，随着类的存在而存在.

如果不提供伴生对象的名字，那么编译器会提供一个默认的名字　Companion.

注意：虽然伴生对象的成员看起来像是Java中的静态成员,但在运行期,
    他们仍旧是真实对象(伴生对象)的实例成员.

    在jvm上，可以将伴生对象的成员真正生成类的静态方法与静态属性,
    这是通过@JvmStatic注解来实现的.

    伴生对象在编译后会生成一个静态内部类.
*/
class MyTest{
    companion object MyObject{//一个类中最多只允许有一个伴生对象
        var a:Int=100
        fun method(){
            println("MyTest　method invoked!")
        }
    }

}
class MyTest2{
    companion object {//＠对象名可以省略，通过类的名字访问，更简便
        //默认伴生对象名字　Companion
        var b:Int=200
        fun method(){
            println("MyTest2 method invoked！")
        }
    }
}

class MyTest3{
    companion object {
        /**
         * Specifies that an additional static method needs to be generated
         *      from this element if it's a function.
         * If this element is a property, additional static getter/setter methods
         *       should be generated.
         */
        @JvmStatic //可以反编译
        fun method(){

        }
    }
}
class MyTest4{
    companion object {

        @JvmStatic//反编译，对比　foo(),bar()
        fun foo(){

        }
        fun bar(){

        }
    }
}
fun main(args: Array<String>) {
    MyTest.MyObject.method()

    println(MyTest.a)//可以直接通过类访问对象属性，类似静态属性
    MyTest.method()//可以直接通过类访问对象方法，类似静态方法

    //采用默认生成的伴生对象的名字
    MyTest2.Companion.method()

    //伴生对象，字节码上看　内部类
    println(MyTest.MyObject.javaClass)//ch09_companionObject.MyTest$MyObject
    println(MyTest.javaClass)//...MyTest$MyObject
    println(MyTest2.javaClass)//..MyTest2$Companion

    /*
    对比 foo()/bar()调用的反编译后的字节码,
    两者都是kotlin的调用方式，不是java的调用方式
     */
    MyTest4.foo()
    MyTest4.bar()
}