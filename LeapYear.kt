/*
Method that takes int year as a parameter and returns if the year is a Leap year or not
 */
fun isLeapYear(year: Int)= if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) true else false
/*
Method main to check the working of isLeapYear method
 */
fun main(args: Array<String>){
    println(isLeapYear(1900))
}