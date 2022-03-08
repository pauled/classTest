package LO2_oop.State

class Chillin (brain: Student) extends State (brain){
  override def study(): Unit = {
    println("I am such a good student that I still study")
  }

  override def getCloserToExam(): Unit = {
    println("I am so good I take exams even after I'm done!")
  }

  override def expressFeelings(): Unit = {
    println("I am done")
  }
}
