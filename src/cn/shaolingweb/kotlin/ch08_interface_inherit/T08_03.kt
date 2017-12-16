package cn.shaolingweb.kotlin.ch08_interface_inherit

/*
继承：方法重写
 */

open class Fruit{
    open fun name(){ //open 可被重写
        println("fruit")
    }
    fun expirationDate(){//会被继承下来
        println("1 month")
    }
}
class Apple:Fruit(){//　()必须
    override fun name(){ //override显式声明，强制的
        println("apple")
    }
}
open class Orange:Fruit(){
    final override fun name(){//覆写了某个方法，但不想让子类覆写
        println("orange")
    }
}

fun main(args: Array<String>) {
    var apple=Apple()
    apple.name()
    apple.expirationDate()
}