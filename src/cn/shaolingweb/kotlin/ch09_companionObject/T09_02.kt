package cn.shaolingweb.kotlin.ch09_companionObject

open class B{
    open fun method(){
        println("class B")
    }
}

/*
实现Ａ，继承Ｂ
 */
class D:A,B(){
    //Alt + Ins
    //Alt+Shift+P
    override fun method() {
        super<A>.method() //调用接口Ａ的method()
        super<B>.method() //调用接口B的method()
        println("class A")
    }

}