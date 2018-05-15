package cn.shaolingweb.kotlin.ch01.ligang_ch03

//3 运算符和表达式
/*
不支持三目,if代替(Elvis ?:).
很多运算符其实等价于oprator修饰的,特定函数名的函数,因此运算符非常强大,
不仅可作用于普通数值类型的变量和常量,也可作用于任何自定义的类,只要它们
提供oprator修饰的,特定函数名的函数即可.

运算符都以方法形式来实现的,这些运算符都具有特定符号(+ 或 * ) 和 固定的优先级.

各运算符对应的方法名是固定的,只要为某类型提供了特定名称的方法,成员或扩展方法皆可.
    plus()  -> +

 */

//@ 单目前缀  + - !
//unaryPlus() +
//unaryMinus() -
//not() !


//@ 自加和自减   ++  -- ,前置,后置不同
//inc()
//dec()

//@ 双目
//plus(x)  +
//minus(x) -
//times(x) *
//div(x)  /
//rem(x)  %
//rangeTo(x) ..



//@ in 和 !in
//contains(x)  in
// a !in b    ==>   !b.minus(a)
    //??


//@ 索引访问运算符
//a[i]  a.get(i)
//a[i,j] a.get(i,j)
//a[i]=b a.set(i,b)
//a[i,j]=b   a.set(i,j,b)



//@ 调用运算符
//a()    a.invoke()
//a(b)   a.invoke(b)
//a(b1,b2) a.invoke(b1,b2)
//a(b1,b2,...)  a.invoke(b1,b2,...)

fun invokeDemo(){
    var mtd=Class.forName("xx").getMethod("length")
    mtd.invoke("abc")
    mtd("abc")
}


//@ 广义赋值
//a += b  plusAssign(b)
// -=     minusAssign(b)
// *=     timesAssign...
// /=     divAssign...
// %=     remAssign...    赋值运算符不是表达式,不需要返回值



//@ 相等和不等
//a == b   , a?.equals(b)?:(b==null)
// a != b  , !(a?.equals(b)?:(b==null))
//Kotlin的"=="不再比较两个变量是否引用同一个对象,和 equals() 比较基本等义,但是空指针安全的.


//@ 比较  --> compareTo()  , Comparable接口中定义的方法, java类实现该接口,则...
//a > b     a.compareTo(b) >0
//a < b
// a >= b
// a <= b


//@ 位 ,略不同
//and(x) 与
//or(x)  或
//inv(x)  非
//xor(x)  异或,  两位相同时返回0 ,否则1
//shl(x)  ←  也移符号位,右补0 , 等价于乘2(只要被移位的二进制码没有发生有效位的数字丢失,
        //  对正数左移出去的都是0,) , 移位运算得到新的结果,而原来的操作数本身是不会改变的.
//shr(x)  →  左符号位填充,结果正负不变 ,等价于除2
//ushr(x)  无符号右移

//仅能对  Int和Long两种类型起作用.
fun demoBits(){
    println(5 and 9)

}


//@ 闭区间 : a..b ,包括边界值
fun  demoRange1(){
    var r1=2..6;
    for (num in r1){
        println("${num}*5=${num*5}")
    }
}

//@ 半开区间 ,  a until b =[a,b)  遍历数组

//@ 反向区间(downTo ,[a..b] ) 和 区间步长(step)
fun demoRange2(){
    for (num in 7 downTo 1 step 2){
        println(num)
    }
}

//@ 运算符重载
//unaryPlus() +
//unaryMinus() -
//not() !
data class Data(val x:Int,val y:Int){
    operator fun unaryMinus():Data{//类定义方法
        return Data(-x,-y)
    }
}

operator fun Data.not():Data{//以扩展方法的形式为Data类定义not()方法
    return Data(-x,-y)
}
//3.4.2 重载自加和自减
data class Data1(val x:Int,val y:Int){
    operator fun inc():Data1{
        return Data1(x + 1, y + 1)
    }
}
operator fun Data1.dec():Data1{//扩展
    return Data1(x-1,y-1)
}








