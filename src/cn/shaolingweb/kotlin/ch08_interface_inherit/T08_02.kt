package cn.shaolingweb.kotlin.ch08_interface_inherit

/*
kotlin默认所有类默认都是无法继承的,
在kotlin中，所有类默认都是final的.
 */

open class Parant(name:String,age:Int){
    //通过　open　关键字，和　final相反，　open可以让其它类继承
}
//继承通过冒号指定，类似 C++
class Child(name:String,age:Int):Parant(name,age){

}

open class Parant2(name:String){
}
class Child2:Parant2{
    /*
    若一个类没有primary构造方法，
    那么这个类的每个secondary构造方法需要通过
    super关键字来初始化父类型 或　通过其它secondary构造方法完成这个任务
    不同的secondary构造方法可以调用父类型不同的构造方法
     */
    constructor(name:String):super(name)
}


