package LO2_oop.State

class Panic (brain: Student) extends State (brain){
  override def study(): Unit = {
    brain.mentalState=new Calm(brain)
  }

  override def getCloserToExam(): Unit = {
    println("all of my drinks are shaken and not stirred")
  }

  override def expressFeelings(): Unit = {
    println("I AM FREAKING OUT MAN")
  }
}
