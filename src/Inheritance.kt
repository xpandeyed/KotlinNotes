fun phoneManager(){
    val phone1 = BasicPhone()
    phone1.call()
}


//by default classes are final
//final means class cannot be inherited
//to make a class from which another class can be inherited we need to make the class open
//kotlin does not allow a class to have more than one parent like C++
open class Phone(){

    init{
        //parent's constructor is called before child's
        println("Parent's constructor called")
    }
    fun call(){
        println("Calling")
    }
    fun switchOff(){
        println("Switching Off")
    }
}

class BasicPhone():Phone(){
    init {
        println("Child's constructor called")
    }
    fun removeBattery(){
        println("Removing battery")
    }
}

open class SmartPhone():Phone(){
    //only open functions/properties can ve overrided in children classes
    //by default functions/properties are also final
    open fun takePicture(){
        println("Taking Picture")
    }
}
class SpecialPhone():SmartPhone(){
    //override keyword is used to override a property or function
    override fun takePicture() {
        println("Opening multiple cameras, taking picture")
    }

}