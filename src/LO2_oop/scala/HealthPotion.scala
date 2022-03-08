package LO2_oop.scala

class HealthPotion (x:Double,y:Double,
                    var increase:Int)
  extends GameItem (x,y){

  override def use(player: Player): Unit = {
    player.health+=increase
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case hp:HealthPotion => this.increase==hp.increase
      case _=>false
    }
  }
  override def toString():String={
    var out:String=s"health var: ${this.xLoc}\n super var: ${super.givemeX()}\n the stupid one: ${xLoc}"
    out
  }
}
