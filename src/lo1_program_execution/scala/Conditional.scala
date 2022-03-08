package lo1_program_execution.scala

object Conditional {
  def computeSize(input: Double): String={
    val large: Double = 60.0
    val medium: Double = 30.0

    if (input>= large){
      "large"
    } else if (input>=medium){
      "medium"
    } else {
      "small"
    }
  }

  def printOneTo(n: Int): Unit = {
    for(i <- 1 to n){
      println("i == " + i)
    }
  }

  def printOneToAlternate(n: Int): Unit = {
    val numbers: Range = 1 to n
    for (i <- numbers) {
      println("i == " + i)
    }
  }

  def main(args: Array[String]): Unit = {
    printOneTo(4)
    printOneToAlternate(3)
    /*println(computeSize(70.0))
    println(computeSize(50.0))
    println(computeSize(10.0))

    val epsilon: Double = 0.00000001
    val b: Double = 0.1
    val c: Double = b * 3
    val expected: Double = 0.3
    println(Math.abs(c - 0.3) < epsilon)
    var aString: String = "6.3"
    var temp:Int =3
    temp+=4

     */
  }
}
