package cn.shaolingweb.kotlin.ch07_Class_secondary

/*
 */
class Person constructor(username:String){

    //private var username:String?=null
    //abstract var username:String //必须在抽象类中

    private var username:String
    private var age:Int
    private var address:String
    init {
        //println(username)//主构造方法的参数
        this.username=username
        age=20
        address="beijing"
    }
    //10 ~18行　，等价于　Java　中的构造器中的初始化

    //secondary构造方法可以没有，或多个,必须　直接或间接　调用primary方法
    constructor(username: String,age:Int):this(username){//直接调用primary
       // println(username + "," + age)
        this.username=username
        this.age=age
        this.address="beijing"
        /*
        总结：
        primary参数及初始化需要结合init代码块,
        secondary在方法体
         */
    }

    constructor(username: String,age: Int,adddres:String):this(username,age){
        //间接调用primary
        this.address=adddres
    }

    fun printInfo(){
        //默认this:${this.xx}
        println("username:${username} , age=${this.age} ,address=${this.address}")
    }
}

fun main(args: Array<String>) {
    val p1=Person("zhangsan")
    val p2=Person("lisi",30)
    val p3=Person("wangwu",40,"hangzhou")
    p1.printInfo()
    p2.printInfo()
    p3.printInfo()
}