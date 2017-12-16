package cn.shaolingweb.kotlin.ch09_companionObject

open class BaseClass{
    open fun method(){

    }
}

abstract class ChildClass:BaseClass(){
    /*
    若父类是普通类，子类是抽象类，可以用抽象方法override父类的具体方法
     */
    override abstract fun method()
}