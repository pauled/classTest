package LO2_oop.scala

object RunParty {
  def main(args: Array[String]): Unit = {
    val mobXP:Int=20
    val bossXP:Int=100
    val hero: Character=new Character()
    hero.winBattle(mobXP)
    val party:Party=new Party()
    party.addCharacter(hero)
    party.addCharacter(new Character)
    party.winBattle(bossXP)
  }
}
