package cn.shaolingweb.kotlin.ch05_when

/**
 * Any,类比 java Object,看Any注释---root,every ... superclass
 * Any 跟 Object不是一回事，是不同语言的
 */
fun d1_convert2Uppercase(str: Any): String? {//? 表示可能返回空
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
    for (i: Int in array.indices) { //下标
        println("array[$i]=${array[i]}") //字符串模板
    }
    println("-------3  withIndex---------")
    for ((idx, value) in array.withIndex()) {
        println("$idx=$value")
    }
}


fun t05_d3_when_v1(str: String): String {
    /*
     kotlin when
         类比java:
            if...else
            if... else if...else... ,
            swich....case....
     */

/*    when(str){ //v1: when(变量或表达式)
        "a"->return "A" // 是 a，返回 A
        "b"->return "B"
        "ab"->return "AB"
        else ->return "other input" //默认处理
    }
*/
    return when (str) {//v2: 直接返回when,省略return,更简洁
        "a" -> "A"
        "b" -> "B"
        "ab" -> "AB"
        else -> "other input"
    }
}

/*
v3 :更简洁

fun 函数名(参数列表)=
    when(变量或表达式){

    }

when 类似一个函数体，可以赋值给函数
 */
fun t05_d3_when_v3(str: String) =
        when (str) {
            "a" -> "A"
            "b" -> "B"
            "ab" -> "AB"
            else -> "other input"
        }

fun t05_d3_when_v4() {
    var a = 6//假设　a　是变量

    //when表达式类似一个值，可以赋值给一个变量
    var result = when (a) {
        1 -> {
            println("a=1")
            10//输出，并返回10
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
    println("a=$a ,result=$result")
}

fun main(args: Array<String>) {
    t05_d3_when_v4()
}