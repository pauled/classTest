package LO2_oop.scala

class Teleporter (x:Double,y:Double,
                  val dx:Double,val dy:Double)
    extends GameItem(x,y) {

  override def use(player: Player): Unit = {
    player.xLoc+=this.dx
    player.yLoc+=this.dy
  }
}
