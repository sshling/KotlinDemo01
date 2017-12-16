package cn.shaolingweb.kotlin.ch06_range_stringEscape_Class

/*


class MyClass{
    /*　定义一个类 */
}

看起来跟Java一样，其实不一样：
1. 没有类体，花括号可以省略，但这样没意义
2. 类没有任何修饰符，就是public
3. 不需要类名跟文件名相同

在Kotlin中，一个类可以有:
1. 一个primary构造方法及一个
2. 或多个secondary构造方法

--主、从构造方法
-- primary构造方法是类头(class header)的一部分，位于类后面，可有若干参数
    constructor(username:String)
-- 若primary构造方法没有任何注解或可见性关键字修饰，那么constructor关键字可省略
1.注解: @XX
2.可见性: private..

    class MyClass(username:String)

-- primary构造方法没有任何代码,只有参数而已。
赋初始值怎么办?
    -　init代码块
    class MyClass(name:String){
        init{
            //赋初始值
        }
    }

类的属性赋值:
    primary构造方法的参数不仅可以放置在init代码块，且可以对属性赋值.

    class Class3(name:String){
        //private val name:String=name.toUpperCase()
        private val name=name.toUpperCase()
    }

init代码块:


 */
class MyClass constructor(username:String){//一个构造方法，参数为字符串
    private val username=username.toUpperCase()//构造方法传递来的，省略了 :String
    init {//初始化代码块，给类成员变量赋初始值的，可访问构造方法的参数
        println("init...$username")
    }

}
class MyClass2(username:String){
    /*
        一个构造方法，参数为字符串.
        若primary构造方法没有任何注解或可见性关键字修饰，
        那么constructor关键字可省略
     */
}
class Class3(name:String){
    //private val name:String=name.toUpperCase()
    private val name=name.toUpperCase()
}
class Class4(name: String){
    init {
        println("init code block, name=${name}")
    }
}
fun main(args: Array<String>) {
    //实例化，没有new
   /* var myObj= MyClass("tom")
    println(myObj)*/
    var obj=Class4("ling")
    println(obj)
}
