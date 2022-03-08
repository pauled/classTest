package LO2_oop.scala

object RunPlayer {
  def main(args: Array[String]): Unit = {
    val player1:Player = new Player(0.0,0.0,
      10)
    val player2:Player=new Player(7.0,-4.0,
      10)
    player1.attack(player2)
    player1.attack(player2)
    val varName:Player=player2
    println(varName)
    //new code for existing main
    val h1:HealthPotion=new HealthPotion(2.0,3.0,5)
    h1.use(player2)
    println(player2)
    val t1:Teleporter=new Teleporter(0,0,-2,-3)
    t1.move(5,5)
    player2.pickUpItem(h1)
    player2.pickUpItem(t1)
    player2.useItem(1)

    val h2:HealthPotion=new HealthPotion(0,0,5)
    val h3:HealthPotion=new HealthPotion(0,0,5)
    val h4=h2

    println(h2==h3)
    println(h2==h4)
    val h5:HealthPotion=new HealthPotion(0,0,5)
    println(h5)
    h5.xLoc = 1
    println(h5)
  }
}
