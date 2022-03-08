package lo1_program_execution

object Temp {
  def computeGeometricSum(n: Int): Int ={
    var result: Int = computeGeometricSum(n - 1)
    result += n
    result
  }

  def main(args: Array[String]): Unit = {
    //val result: Int = computeGeometricSum(3)
    //println(result)
    println(assert(5==5))
  }
}
