package Scopes
// 1. Function prints a string with interppolated strings
 fun functionnameWithTitle( name:String, title:String = "Mr."){
     println(" My name is [$title] $name")
 }
// 2. Function returns unit
fun helloworld():Unit{
    print("Hello world")
}


fun main(){
    functionnameWithTitle("Alpha Omondi")
    helloworld()

}