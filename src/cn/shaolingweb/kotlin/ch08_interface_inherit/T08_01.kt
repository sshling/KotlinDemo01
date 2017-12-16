package cn.shaolingweb.kotlin.ch08_interface_inherit


class Student3(val username:String="zhangsan"){
//class Student3(private val username:String="zhangsan"){

}

fun main(args: Array<String>) {
    var s3 = Student3()
    println(s3.username)//可以直接访问属性
    //若private修饰属性则这里就不能直接访问了

    s3= Student3("lisi")
    println(s3.username)//属性的值，不再使用默认值，而使用传递的参数
}