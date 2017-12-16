package cn.shaolingweb.kotlin.ch10_property

/*
关于延迟初始化属性:

kotlin要求非空类型的属性必须要在构造方法中进行初始化.
    非空, name:String, 没有　问号(?) 表示可为空
    空, name:String?

有时这种要求不太方便，比如可以通过依赖注入或单元测试情况下进行属性的赋值.

通过 lateinit 关键字标识属性为延迟初始化，需要满足３个条件:
1. lateinit只能用在类体中声明的var属性上，不能用在　primary constructor 声明的属性上.
2.　属性不能拥有自定义的setter/getter.
3. 属性类型需要为非空,且不能是原生数据类型

 */
class TheClass{
    //property,延迟初始化
    lateinit var name:String

    fun ini(){
        this.name="zhangsan"
        //name="lisi" //可以省略　this.
    }
    fun print(){
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var obj=TheClass()
    obj.ini()
    obj.print()
}