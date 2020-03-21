/*
Function to return if an year is a leap year or not having an Integer int as a parameter
 */
fun isLeapYear(year: Int) = if(year%4 == 0) true else false
/*
Function main checking the run of isLeapYear()
 */
fun main(args: Array<String>){
   println(isLeapYear(2010))
}