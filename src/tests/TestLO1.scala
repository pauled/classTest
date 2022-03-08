package tests

import org.scalatest.FunSuite
import lo1_program_execution.scala._

class TestLO1 extends FunSuite{
  test("Doubles are checked for size in each category") {
    val largeDouble: Double = 70.0
    val mediumDouble: Double = 50.0
    val smallDouble: Double = 10.0

    assert(Conditional.computeSize(largeDouble) == "large", largeDouble)
    assert(Conditional.computeSize(mediumDouble) == "medium", mediumDouble)
    assert(Conditional.computeSize(smallDouble) == "small", smallDouble)
  }
  test("is Anagram test") {
    val testCases: Map[List[String], Boolean] = Map(
      List("Astronomer", "Moon Starer") -> true,
      List("Astronomers", "Moon Starers") -> true,
      List("asdf", "fdsa") -> true,
      List("ASDf", "fsAd") -> true,
      List("Hart loff ", "  F  o r t  L a h    f ") -> true,
      List("Hartloff", "Fort Half") -> true,
      List("oop", "OPO") -> true,
      List("oop", "POO") -> true,
      List("ooooo", "ooooo") -> true,
      List("", "") -> true,
      List("oop", "POOO") -> false,
      List("oop", "POP") -> false,
      List("oop", "pop") -> false,
      List("oop", "POOO") -> false,
      List("oooo", "ooooo") -> false,
      List("", "a") -> false,
      List("licky charms", "charms lucky") -> false
    )

    for((inputs, expectedOutput) <- testCases){
      assert(Anagram.isAnagram(inputs.head, inputs(1)) == expectedOutput, inputs)
    }
  }
}
