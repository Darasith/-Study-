package enterinput

object convertdaytoyear {
  def main(args: Array[String]): Unit = {
    println("Enter the number of days a year")
    var days = scala.io.StdIn.readInt()
    var year = (days/365)
    var month = (days-(year*365))/30
    var day = days-(year*365)-(month*30)
    println(s"Number of year is $year, Number of month is $month,Number of day remaining is $day")
  }
}
