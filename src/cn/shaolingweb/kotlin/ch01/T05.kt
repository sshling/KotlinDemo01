package cn.shaolingweb.kotlin.ch01

/**
 * Any,类比 java Object,看Any注释---root,every ... superclass
 * Any 跟 Object不是一回事，是不同语言的
 */
fun d1_convert2Uppercase(str: Any): String? {
    if (str is String) {
        //str --> smart cast to Kotlin.String,比java智能多了，无需再强制转换了
        return str.toUpperCase()
    }
    return null
}

fun d2_arr() { //数组定义
    /*
    public fun intArrayOf(vararg elements: Int): IntArray
    */

    /**Int：int
     *  Represents a 32-bit signed integer.
     * On the JVM, non-nullable values of this type are represented as values of the primitive type `int`.
     */

    /**IntArray：int[]
     *  An array of ints. When targeting the JVM, instances of this class are represented as `int[]`.
     */
    var array: IntArray = intArrayOf(1, 3)
    var arr2 = intArrayOf(1, 3)//简写
    for (item in array) {
        println(item)
    }
    println("-------2 index ---------")
    for (i: Int in array.indices) {
        println("array[$i]=${array[i]}")
    }
    println("-------3  withIndex---------")
    for ((idx, value) in array.withIndex()) {
        println("$idx=$value")
    }
}

fun t05_d3_when_v1(str: String): String {
    /*
     when  类比java if...else if... else if...else... , swich....case....
     */

/*    when(str){ //v1: when(变量或表达式)
        "a"->return "A" // 是 a，返回 A
        "b"->return "B"
        "ab"->return "AB"
        else ->return "other input" //默认处理
    }
*/
    return when (str) {//v2: 直接返回when,更简洁
        "a" -> "A"
        "b" -> "B"
        "ab" -> "AB"
        else -> "other input"
    }
}

fun t05_d3_when_v2(str: String) = //v3 :更简洁
        when (str) {
            "a" -> "A"
            "b" -> "B"
            "ab" -> "AB"
            else -> "other input"
        }

fun t05_d3_when_v3() {
    var a = 6//建设a是变量
    var result = when (a) {
        1 -> {
            println("a=1")
            10
        }
        2 -> {
            println("a=2")
            20
        }
        3, 4, 5 -> {
            println("a=3 or 4 or 5")
            30
        }
        in 6..10 ->{ //范围Range,  .. 运算符重写，闭区间
            println("a=[6,10]")
            40
        }
        else -> {
            println("a is other value")
            50
        }
    }
}

fun main(args: Array<String>) {

}