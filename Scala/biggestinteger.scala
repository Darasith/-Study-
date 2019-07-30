package enterinput

object biggestinteger {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    var num1 = scala.io.StdIn.readInt()
    println("Enter the second number")
    var num2 = scala.io.StdIn.readInt()
    println("Enter the Third number")
    var num3 = scala.io.StdIn.readInt()
    if (num1>num2){
      if(num1>num3){
        println(s"Biggest number is $num1")
      }
      else {
        println(s"Biggest number is $num3")
      }
    }
    else if(num2>num1){
      if(num2>num3){
        println(s"Biggest number is $num2")
      }
      else{
        println(s"Biggest number is $num3")
      }
    }
    else{
      println(s"Biggest number is $num3")
    }
  }

}
