fun nullHandler(){
    //? makes a nullable type
    var gender : String? = null
    var num: Int? = null

    //safe call operator ?
    //the function toUpperCase will only be called if gender is not null
    gender?.toUpperCase()

    //for multiple statements after null check let is used with ?
    gender = "MALE"
    gender.let {
        println(gender)
        println("My Gender is : ")
        println("May or may not be null")
        println(it)//it points the variable to which this let block belongs
    }
    //let can be called with null and non-null all
    num = 10
    num.let{
        println(it)
        println(num)
        println(it.toString())
    }

    //elvis operator
    val gender2 = gender?:"Not available" //if gender is null then the "Not available" will be assigned to gender2, therefore gender2 is not-nullable type

    //not null asserted operator
    //!! operator lets the following code execute if the variable is not null and throws an error if the variable is null
    var value = gender2!!.toUpperCase()
}