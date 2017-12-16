package cn.shaolingweb.kotlin.ch11_visibility_extension

/*
扩展:extension
给类扩充功能，

java:
    继承
    装饰：不修改类，动态增加功能, java IO.
    组合

 */

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun substract(a: Int, b: Int) = a - b
}

//扩充类ExtensionTest功能，不能基于原来修改
//xxx类的扩展函数
/*
扩展函数的解析是静态的:
1. multiply没有插入原有类,反编译看不到这个方法.
2. 扩展函数的解析是静态分发的，而不是动态的,即不支持多态,调用只取决于对象的声明类型.
    多态：通过父类型的引用指向子类型的引用,真正调用哪个方法取决于调用者运行期的类型.
3. 调用是由对象声明的类型所决定的,而不是由对象的实际类型决定.
 */
fun ExtensionTest.multiply(a:Int,b:Int)=a*b

fun main(args: Array<String>) {
    var ext = ExtensionTest()
    println(ext.add(1, 2))
    println(ext.substract(1, 2))
    println(ext.multiply(3, 2))


    myPrint(AA())//a
    myPrint(BB())//a,仍旧是a -- 调用由声明类型决定，不支持多态
}
open class AA
class BB:AA()

fun AA.a()="a"
fun BB.a()="b"

fun myPrint(aa:AA){
    println(aa.a())
}