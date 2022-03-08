package LO2_oop.State

class Student {
  var mentalState:State=new Calm(this)

  def study(): Unit = {
    this.mentalState.study()
  }

  def getCloserToExam(): Unit = {
    this.mentalState.getCloserToExam()
  }

  def expressFeelings(): Unit = {
    this.mentalState.expressFeelings()
  }
  def passClass():Unit={
    this.mentalState=new Chillin(this)
  }
}
