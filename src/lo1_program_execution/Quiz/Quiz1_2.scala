package lo1_program_execution.Quiz

object Quiz1_2 {
  def method2(values:Array[Int]):Int={
    var t:Int=0
    for (element <- values){
      t+=element
    }
    t
  }

  def main(args: Array[String]): Unit = {
    var arr:Array[Int]=Array(1,3,5)
    for (i <- arr.indices){
      println(i+": "+arr(i))
    }
    var result=method2(arr)
    print(result)
  }
}
