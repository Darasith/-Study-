package enterinput

object userinput {
  def int(a:Float,b:Float,c:Float): Float = {
    return a+b/c
  }
  def main(args: Array[String]): Unit = {
    println("Enter the first weight")
    val inp1 = scala.io.StdIn.readFloat()
    println("Enter the second weight")
    val inp2 = scala.io.StdIn.readFloat()
    println("Enter number of purchase")
    var pri = scala.io.StdIn.readFloat()
    var res = int (inp1,inp2,pri)
    println(s"Sum of user input is $res")

  }

}
