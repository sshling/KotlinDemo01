package cn.shaolingweb.kotlin.ch01

import java.util.*
import java.util.function.Consumer

//1. 声明变量
/*
var|val  变量名 [:类型] [=初始值]

val
1. 局部. 第一次使用之前
2. 类级别. 声明时或构造器中
*/


//2. 整型:Byte,Short,Int(默认),Long
/*
最高位符号位 -2^n ~ 2^n-1
尽量会用Int 提高代码的一致性和复用性

皆为引用类型,非基本类型.

null安全,都不接受null值,非要存储null值:  "类型?"
- 普通的整型变量将映射为Java的基本类型,带"?"后缀的将映射为包装类.
   == 和 equals 的不同.

整数数值: 支持10,2,16进制, no 8.


字符串模板:
    字符串中嵌入 "${}"

为了可读性,允许为数值()增加下划线作为分隔符,也可以前补0.
 */


//3. 浮点型: Float,Double(默认)
/*

2种表示:
1. 十进制形式.
2. 科学计数形式.
    5.12e2=5.12 x 10^2

3个特殊的浮点型数值: 正负无穷大,非数

*/


//4 字符型: 单
/*
3种表示形式:
- 单字符
- 转义
- unicode值: \uxxxx  十六进制

不能像java一样 ,当整数值使用.
 */


//5. 数值型之间的类型转换
/*
1. 整型间:
    不支持 取值范围小的数据类型 隐式转换为 取值范围大的类型.

    "类型".toXxx()  , 要求不同整型必须显式转换.

    int->byte: 溢出
    1. 截断前24,留后8位;
    2. 最左符号位是1,是负数
    3. 负数在计算机以"补码"形式存在,需转成原码
        补码-1=反码
        反码取反=原码 ,符号位不动

    虽然却隐式转换,但在表达式中可以自动转换,基于上下文推断.

    ${xxx.javaClass} ,变量的javaClass属性,来自Any类型(根父).


    Char值加,减一个整型值: char值的字符编码(数字)进行加减该整数,然后将计算结果---->char型.
    两个char型可减,不可加!

2. 浮点与整型


3. 表达式类型的自动提升
   - 所有的Byte,Short -> Int -> Long -> Float -> Double

*/


//@ Boolean类型
/*
只能 true/false, 不能0或非0
不能字符串式的 "true/false"

Boolean , Boolean? 跟 Int类似.


*/
//@ null安全
// 1. 非空和可空类型
fun nullDemo() {
    var str = "fkit"
    var a: Int? = str.toIntOrNull();
    var b = str.toIntOrNull(); //自推断可空

    //对可控类型进行了限制:若不加任何处理,可空类型不允许直接调用方法,访问属性.

    //先判断,后使用
    var x: String? = "xxx"
    var len = if (x != null) x.length else -1;//1.1

    var flag:Boolean?=null;
    if (flag==true){ //需要 Boolean? 类型变量显式与 true/false/比较,其与Boolean本质上是两种不同的类型.
        println("true...")
    }

    //安全调用:
    println(x?.length)//"?." ,为null返回null,而不是NPL.

    //定义元素可空的数组
    val arr:Array<String?> = arrayOf("aa", "bb")
    for (item in arr){
        //当item不为null时才调用let函数
        item?.let { println(it) }
    }

    //1.2 Elvis运算("?:"): if else 的简化写法 ----eq 1.1
    //若"?:"左边的表达式不为null,则返回左边表达式的值,否则返回其右边表达式的值
    //return,throw都属于表达式
    var len2 = x?.length ?: -1

    //1.3 强制调用,不管是否null都直接调用该变量的方法或属性: "!!." , maybe NPL.

}

//2.9 字符串
/*
s[i] ,for..
 */
fun strDemo(){
    var s="xxx"
    println(s)
    for (x in s){
        println(x)
    }
    //1 两种literal: 转义 & 原始.
    var s2="a\bc"

    //三引
    var s3="""
            |a
            |b
            |c
        """.trimMargin() //默认"|"作为边界符,其之前的内容都会被去掉

    //2 字符粗模板 ${xx} ,插入变量或表达式
    var rand=Random()//创建Java的Random对象
    var s4="伪随机数:${rand.nextInt(10)+2}"
    var s5="${s4}}的长度=${s4.length}"

    //3 与Java的String并不是同一个类,方法略有不同,但功能相似.
    //toXXX() 转为数值
    //工具方法:
    var s6="ab".capitalize()
    s6="Ab".decapitalize()
    s6="abXy".commonPrefixWith("acxy")
    s6="abxy".commonSuffixWith("cdxy")
    s6.contains("\\d{3}") //支持正则 ,看官方
}

//2.10 类型别名, 相当于C的typedef ,为已有的类型指定另个可读性更强的名字
// typealias 类型别名=已有类型
//内部类起个更短的名字

//java Lambda表达式的类型是函数式接口,而Kotlin的lambda表达式的类型直接就是函数类型,因此其允许为Lambda表达式的类型指定别名
typealias Predict<T> =(T)->Boolean //非字面量替换,支持泛型
fun  demo10(){
    var p:Predict<String> = {it.length>4}
    print(arrayOf("a","bc","xabcd").filter(p))
}



fun main(args: Array<String>) {
    //1. 定义、遍历 List
    val list: List<String> = listOf("hello", "world")
    for (item in list) {
        println(item)
    }
    println("------------- 2. 函数式遍历")
    //参数是Consumer
    list.forEach(Consumer { println(it) })//it是语法糖，当前遍历到的元素
    println("------------- 3. 方法引用")
    list.forEach(System.out::println)
    //1,2,3 -> Kotlin相比Java的臃肿显得异常简洁，但是Java 100%互操作
}
