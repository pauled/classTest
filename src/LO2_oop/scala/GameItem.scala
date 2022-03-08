package LO2_oop.scala

abstract class GameItem(xLoc:Double,yLoc:Double)
      extends GameObject (xLoc,yLoc){
  def use(player: Player):Unit

  def givemeX(): Double ={
    this.xLoc
  }
}
