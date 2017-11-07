package cn.shaolingweb.kotlin.ch01

/**
 * 范围的表示种类
 */
fun t06_d1() {
    val a = 5
    val b = 10
    if (a in 2..b) {//.. 默认step=1 ,步进
        println("in the range")
    }
    if (a !in 2..b) {// !in 不在
        println("out of the range")
    }
    for (i in 2..10) {//闭区间
        println(i)
    }
    for (i in 2.rangeTo(10)) {//last on 本质
        println(i)
    }
    //step != 1
    for (i in 2..10 step 2) {
        println(i)
    }
    // 10 -> 2 ,step=2
    for (i in 10 downTo 2 step 2) {//不可以 10..2
        println("10 downTo 2 step 2-->$i")
    }
}

fun t06_d2() {
    var arr = listOf<String>("a", "ba")
    for (item in arr) {
        println(item)
    }
    when{
        "a" in arr -> println("a in collection")
    }
    arr.filter { it.length>1 }
            .map { it.toUpperCase() }
            .sorted()
            .forEach{ println(it)}

}
fun t06_d3(){ //字符串
    var a:String="hello \n world"
    println(a) // \n 转义为换行
    //让字符串保持原样输出, 三个双引号
    var b:String=""" hello \n world """
    println("b=$b")

}
fun main(args: Array<String>) {
    t06_d3()
}