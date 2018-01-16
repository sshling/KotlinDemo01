# KotlinDemo01
```
ch14 协变和逆变

生产者(只从中读取) -> ? extends U ,协变(  co-variant   ) , out
消费者(只向其写入) -> ? super   B ,逆变(control-variant) , in

<Any,Int> = <String,Number> 
get,set
String -> Any , get , String 按 Any读取，按上界，out
Number -> Int , set , Number 按子类 Int处理，按下界 , in
```
add comment1
