package cn.shaolingweb.kotlin.ch01

import cn.shaolingweb.kotlin.ch02.multiply

fun d1() {
    //1. val定义常量，不可修改，类似final
    val a: Int = 1
    //2. 类型推断，无需指定类型
    val b = 2
    //3. var 定义变量
    var c = 3
    c = 4

    //4. 注释，行、块
    //行

    /**
     * 块
     * */

    /*
     块
     */

    /*
        /*
          块注释可嵌套，避免...
         */
     */
}

fun d2() {
    /*
    赋值类型必须一致，不可以小范围(byte)  赋值给 大范围(int)
     */
    var x = 10
    var y: Byte = 20
    //x=y //ERROR
    x = y.toInt()//需转，Kotlin中所有类型都是对象
}

fun d3() {
    //import cn.shaolingweb.kotlin.ch02.multiply
    multiply(2, 3)
}

fun d4() {
    val m = intArrayOf(1, 2)//常量
    //m= intArrayOf(2,4)// ERROR
    m.set(1, 4)//m不可变，但m指向的对象的内容可以改变，类比Java final对象——对象属性可变
}

fun d5_if() {//流控
    var x = 10
    var y = 20
    var max: Int
    var min: Int
    //old
    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }
    //new 1,
    // if 跟表达式的值直接返回
    max = if (x > y) x else y
    min = if (x > y) y else x
    //new 2, if 跟代码块，其最后一句做为返回值
    max = if (x > y) {
        println("x>y")
        x
    } else {
        println("x<y")
        y
    }
}

/*
返回类型 追加 ? ,表示这是一个整数，但可能为空,示例可能返回null
 */
fun d6_sr2Int(str: String): Int? {
    //字符串 转 整数 ，java常见
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        return null
    }

}
fun test_d6(a: String, b: String) {
    var a2Int = d6_sr2Int(a)
    var b2Int = d6_sr2Int(b)
    /**
     * ERROR
     * Required: Int
     * Found: Int?
     */
    //println(a2Int*b2Int)
    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int) // 推断得出 Int? 非 null，所以允许相乘
    } else {
        println("param not int")
    }
}

fun main(args: Array<String>) {


}