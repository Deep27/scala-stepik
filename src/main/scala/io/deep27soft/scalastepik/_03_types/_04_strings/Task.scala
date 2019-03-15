package io.deep27soft.scalastepik._03_types._04_strings

import scala.io.StdIn.readLine

object Task {

  def main(args: Array[String]) {

    val indexes = readLine().split(" ").map(_.toInt)
    val input = readLine()

    val substr = input.substring(indexes(0), indexes(1) + 1)
    val splitted = input.split(substr)
    val newString = splitted(0) + substr.reverse + splitted(1)
    println(newString)
  }
}
