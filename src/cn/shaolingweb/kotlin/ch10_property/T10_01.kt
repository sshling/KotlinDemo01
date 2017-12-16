package cn.shaolingweb.kotlin.ch10_property

/*
属性揭秘与延迟初始化特性

var propertyName:propertyType[=initializer]
    [getter()...]
    [setter()...]

backing field,支撑字段(域)
    只能在一个属性的访问器(get/set)中使用

backing property, 支撑属性
    私有的，不能直接访问，间接访问——其它有set/get属性的来访问

*/

/*
//test 1
class Person{
    val age=10
}
fun main(args: Array<String>) {
    var p=Person()
    p.age//kotlin的调用方法，内部调用的是get方法
}
*/


class Person(address: String, name: String) {

    /*
    声明int常量,定义get方法,调用时:　obj.age

    只读属性２个特点:
    1. val定义
    2. 只有get(),没有set()
     */
    val age: Int
        get() = 20//只有一个语句，可以直接=赋值

    /*
    set/get有kotlin编译器自动生成，称为默认的，
    可以修改
     */
    var address: String = address
        get() {
            println("address get invoked")
            return field //@@@@ 注意：这里是field关键字－－backing field
        }
        set(value) {
            println("address set invoked")
            field = value
        }

    var name:String=name
        /*　如下是 get/set的默认实现
        get() {
            return field
        }
        set(value) {
            field=value
        }*/

        /* 只是改成 private
        private set
        private get
        */
    //lombok  @Getter @Setter @Data

}

fun main(args: Array<String>) {
    var p=Person("shanghai","zhangsan")
    println(p.age)
    println(p.address) //getter
    p.address="tianjing" //setter
}