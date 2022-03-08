package lo1_program_execution.scala

object TraceExample {
  def doSoemthing(i: Int, strings: Array[String]):String={
    var out:String=""
    for (value <- strings){
      out=out+value
    }
    out
  }
  def main(args: Array[String]): Unit = {
    var a:Int=5
    a+=3
    var str1:String="this"
    str1+=" is fun"
    println(a)
    var arr:Array[String]=Array("a","b","c")
    var result=doSoemthing(a,arr)
    println(result)
  }
}
