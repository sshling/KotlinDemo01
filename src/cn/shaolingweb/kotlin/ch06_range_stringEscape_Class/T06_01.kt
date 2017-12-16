package cn.shaolingweb.kotlin.ch06_range_stringEscape_Class

/**
 * 范围的表示种类
 */
fun t06_d1() {
    val a = 5
    val b = 10
    if (a in 2..b) {//1.  .. 默认step=1 ,步进
        println("in the range")
    }
    if (a !in 2..b) {//2. !in 不在
        println("out of the range")
    }
    for (i in 2..10) {//3. 闭区间
        println(i)
    }
    //kotlin int是类，所以就有方法
    //rangeTo
    for (i in 2.rangeTo(10)) {//last on,同上(..),本质
        println(i)
    }
    //step 不取默认值
    for (i in 2..10 step 2) {
        println(i)
    }
    // 10 -> 2 ,step=2　，注意:不可以 10..2
    for (i in 10 downTo 2 step 2) {
        println("10 downTo 2 step 2-->$i")
    }
    //kotlin初用起来看似很简单，但深入很复杂性.就如Netty
    //
}


fun t06_d2() {
    /*
    listOf() 方法
     */
    var arr = listOf<String>("a", "ba")
    //TODO 查看arr的其它方法


    for (item in arr) {
        println(item)
    }
    when{ //when的使用,代替　if
        "a" in arr -> println("a in collection")
    }

    // it 表示当前遍历到的某元素
    arr.filter { it.length>1 }//过滤
            .map { it.toUpperCase() }//映射
            .sorted()//排序
            .forEach{ println(it)}//遍历输出

    //保持学习，每一次努力，早晚都会有汇报
    //每一天的懒惰，每一次的自我放弃，早晚也会让你付出代价的
}

fun t06_d3(){ //字符串
    // 字符串中"\n" 被转义为换行
    var a:String="hello \n world"
    println(a)

    //不转义:让字符串保持原样输出,3个双引号
    var b:String=""" hello \n
        | world
        | ,goodby """
            .trimMargin()
    println("b=$b")

}


fun main(args: Array<String>) {
    t06_d3()
}