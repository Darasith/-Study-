package enterinput

object employeeid {
  def cal(a:Int,b:Int):Int = {
    return a*b
  }
  def main(args: Array[String]): Unit = {
    println("Enter the ID")
    var id = scala.io.StdIn.readInt()
    println("Enter Total work hour")
    var totalhour = scala.io.StdIn.readInt()
    println("Enter the money per hour")
    var moneyhour = scala.io.StdIn.readInt()
    var res = cal(totalhour,moneyhour)
    var array = new Array[Int](2)
    println(s"ID: $id, salary is $res")
  }
}
