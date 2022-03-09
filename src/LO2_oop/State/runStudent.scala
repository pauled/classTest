package LO2_oop.State

object runStudent {
  def main(args: Array[String]): Unit = {
    var paul:Student=new Student()
    paul.study()
    paul.getCloserToExam()
    paul.getCloserToExam()
    paul.expressFeelings()
    paul.study()
    paul.expressFeelings()
    paul.passClass()
    paul.expressFeelings()
  }

}
