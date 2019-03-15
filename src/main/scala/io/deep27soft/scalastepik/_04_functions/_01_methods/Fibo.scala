package io.deep27soft.scalastepik._04_functions._01_methods

import scala.annotation.tailrec

object Fibo {

  def main(args: Array[String]): Unit = {

    println(fibs(7))
    println(fibsTailed(7))
    cyclic(6)
  }

  def fibs(num: Int): Int = {
    if (num < 3) 1
    else fibs(num - 2) + fibs(num - 1)
  }

  def cyclic(num: Int): Int = {
    var num1 = 0
    var num2 = 1
    var sum = 1
    for (i <- 1 until num) {
      sum = num1 + num2
      num1 = num2
      num2 = sum
      print(sum + " ")
    }
    sum
  }

  @tailrec
  def fibsTailed(of: Int, num1: Int = 0, num2: Int = 1): Int = {
    if (of < 3) num1 + num2
    else fibsTailed(of - 1, num2, num1 + num2)
  }
}
