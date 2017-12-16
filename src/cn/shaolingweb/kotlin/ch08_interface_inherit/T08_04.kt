package cn.shaolingweb.kotlin.ch08_interface_inherit

/*
属性的覆写
 */

open class MyParent{
    open val name:String="parent"
}
class MyChild:MyParent(){
    override val name:String="child"//val
}

fun main(args: Array<String>) {
    var myChild=MyChild()
    println(myChild.name)
}

class MyChild2(override val name:String):MyParent(){
    /*
        简便覆写
    */
}

