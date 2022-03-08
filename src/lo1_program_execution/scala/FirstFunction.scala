package lo1_program_execution.scala

object FirstFunction {
  def multipyByTwo(input: Double): Double={
    input * 2.0
  }

  def multiplyArray(input: Int,arrayIn: Array[Int]): Unit={
    for (index <-0 to (arrayIn.length -1)) {
      arrayIn(index)*=input
    }
  }

  def main(args: Array[String]): Unit = {
    var x: Double = 7.0
    var result = multipyByTwo(x)
    println(result)

    var ar : Array[Int]=Array(1,2,3)
    var ar2: Array[Int]=ar
    multiplyArray(2,ar2)
    println(ar)
    for (element <- ar) {
      println(element)
    }

    var list: List[Int] = List(2, 3, 4)

    val x1: Int = list.head
    println("x1:="+x1)

    val y: Int = list.apply(1)
    println("y="+y)

    list = list :+ 50
    for(element <- list){
      println(element)
    }
println()
    list = 70 :: list

    for(element <- list){
      println(element)
    }
  }
}
