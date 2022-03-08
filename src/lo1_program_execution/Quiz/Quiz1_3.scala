package lo1_program_execution.Quiz

object Quiz1_3 {
  def fixName(name:String): String={
    if (name.equalsIgnoreCase("paul")){
      "Jesse"
    } else {
      "Paul"
    }
  }
  def fixAdj(adj:String): String={
    var out=""
    for (i <- 1 to adj.length-1){
      out=adj(i)+out
    }
    out
  }
  def combine(name:String,adj:String):Unit={
    println(name+" is "+adj)
  }
  def main(args: Array[String]): Unit = {
    var name:String="Paul"
    var adj:String="alive"
    combine(name,adj)
    name=fixName(name)
    adj=fixAdj(adj)
    combine(name,adj)
  }
}
