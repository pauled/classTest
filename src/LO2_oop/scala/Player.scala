package LO2_oop.scala

class Player(xLoc:Double,yLoc:Double,
             var maxHitPoints:Int)
      extends GameObject (xLoc,yLoc){
  var health:Int=this.maxHitPoints
  val damageDealt:Int=4
  var inventory:Array[GameItem]=new Array[GameItem](5)
  var invLoc:Int=0

  def pickUpItem(gameItem: GameItem):Unit={
    inventory(invLoc)=gameItem
    invLoc+=1
  }
  def useItem(loc:Int):Unit={
    if (loc<invLoc){
      inventory(loc).use(this)
    }
  }

  def attack(otherPlayer: Player):Unit={
    otherPlayer.takeDamage(this.damageDealt)
  }
  def takeDamage(damage: Int):Unit={
    this.health-=damage
  }
  override def toString():String={
    var out:String=super.toString()
    out+=" health: "
    out+=this.health+"/"+this.maxHitPoints
    out
  }
}
