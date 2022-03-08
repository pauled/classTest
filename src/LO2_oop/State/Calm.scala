package LO2_oop.State

class Calm (brain: Student) extends State (brain){
  override def study(): Unit = {
    println("remaining calm and not panicing")
  }

  override def getCloserToExam(): Unit = {
    brain.mentalState=new Panic(brain)
  }

  override def expressFeelings(): Unit = {

    println("I am a leaf on the wind")
  }
}
