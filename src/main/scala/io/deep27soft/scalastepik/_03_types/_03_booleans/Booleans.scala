package io.deep27soft.scalastepik._03_types._03_booleans

object Booleans {

  def main(args: Array[String]): Unit = {
    println(isCapital("Gex", 0))
    println(isCapital("Gex", 2))
  }

  def isCapital(word: String, pos: Int): Boolean = {
    word(pos).isUpper
  }
}
