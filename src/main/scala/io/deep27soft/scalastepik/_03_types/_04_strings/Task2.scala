package io.deep27soft.scalastepik._03_types._04_strings

import scala.io.StdIn.readLine

object Task2 {

  def main(args: Array[String]): Unit = {
    val input = readLine()
    val regex = "^(?!_)([a-z]+|_(?!_))*[^_]$".r
    val regex2 = "^[a-z]+(_[a-z]+)*?".r
    println(regex2.pattern.matcher(input).matches)
  }
}
