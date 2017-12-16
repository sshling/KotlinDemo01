package cn.shaolingweb.kotlin.ch11_visibility_extension
/*
访问修饰符，多写几次，就像练习打字，不需要去记忆键盘位置，敲打多了，自然反应。

可见性:visibility

java:
    private/package(默认)/protected/public
kotlin:
    private/protected/internal/public(默认)

    private：只能当前文件可以用
    protected:不能用在顶层类或方法
    internal：只能同一个模块下使用.
        模块:编译会编译到一起的.
    public: 什么地方都可以用
*/

/*
类里边
private:当前类内使用
protected:可以当前类，子类使用
internal：
    相同模块，能访问类就能使用
public：　any
*/

/*
局部变量,没有访问修饰符
 */

open class D{
    private val b=3
    protected open val c=4
    internal val d=5
}
class Sub:D(){
    //b不能用
    //c可以用
    //d 可以用
}