package lo1_program_execution.Quiz

object Quiz1_1 {
  def method1(param:Int,param2:Double):Double={
    if (param>0){
      param2*2
    } else {
      param2*4
    }
  }
  def main(args: Array[String]): Unit = {
    val pi:Double=3.1415
    var x:Int=3
    var y:Double=2.5
    var str1:String="this"
    x+=5
    y=2+x
    var result=method1(x,y)
  }
}
