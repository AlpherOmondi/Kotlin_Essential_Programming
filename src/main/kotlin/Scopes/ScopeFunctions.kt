package Scopes

import java.security.KeyStore.TrustedCertificateEntry

class Person {
    var name : String? = null
    var age : Int? = null

}
class Mammalia{
    var layEggs : Boolean = true
    var hasHair : Boolean = true

}
fun main() {


    val bear = Mammalia().apply {
        layEggs= false
        hasHair = false
    }
    print(bear)

}




