# Scopes
A **Scope** refers to a section of code where one can declare some:

1. Variable.
2. Class.
3. Function.

In fact everytime you have declared a new variable you have always declared it to some scope.
<br> In this project I am going to create a package that will contain a kotlin file named Scope that we will use to practice Scopes.
<br> When I was working on this, a question popped up in my mind. 
# What is the difference between a package and a folder.
Historically we have relied on folder organization system.<br>
Packages is a relatively recent development.
## The biggest difference 
1. **Packages are selfcontained**  - meaning everything you require for your project can be found inside it.
2. Folders on the other hand are more **transparent holds more general info**.
3. One can have multiple packages inside a folder.

Lets start understanding scopes :
1. Create a file named `Scope.kt` .
2. Inside the file create a variable PI.
PI is in the file's scope.
```Kotlin 
 val PI = 3.14 //Top level scope.
class Circle( radius: Double){ // Class scope
    val diameter = radius * 2 
    // This is a nested scope
   fun circumference(): Double{ // Function scope
       val result  = PI * diameter
       return result 
       
   }
    fun createCircles(radii:List<Double>): List<Circle>{
        return radii.map { radius -> // Lambda scope
            Circle(radius)
        }
    }
       
 
}

```
The above variable is in the  top level scope.

## Scope functions
There are 5 scope functions namely :
# 1. with
COntext object : this
Returns : the last value in the lambda.
2. let
3. run
4. apply
5. also
For example :
