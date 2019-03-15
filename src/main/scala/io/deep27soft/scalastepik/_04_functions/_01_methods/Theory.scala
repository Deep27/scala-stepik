package io.deep27soft.scalastepik._04_functions._01_methods

import scala.annotation.tailrec

object Theory {

  def main(args: Array[String]): Unit = {
    println(sumAllTimes(1, 2, 3, 4, 5))
    println(plus3(3, 1))
    println(plus3(2, z = 2))
    println(plus3(2, z = 2, y = 4))
    println("====================")

    println(replaceNegative(1, {
      println("calculated")
      3 * 3 * 3
    }))

    println(replaceNegative(-1, {
      println("calculated")
      3 * 3 * 3
    }))

    println(sumRange(5, 10))

    println(sumRange(1, 2))
  }

  // метод с повторяемым параметром (коллекцией)
  def sumAllTimes(u: Int, nums: Int*): Int = u * nums.sum

  def plus3(x: Int, y: Int = 0, z: Int = 0): Int = 100 * x + 10 * y + z

  // вычисление значения только когда необходимо
  def replaceNegative(x: Int, z: => Int): Int = if (x >= 0) x else z

  // рекурсия
  // @tailrec // компилятор не может развернуть функцию в цикл
  def sumRange(from: Int, to: Int): Int =
    if (to < from) 0
    else from + sumRange(from + 1, to)

  // хвостовая рекурсия
  @tailrec // компилятор развернет ее в цикл
  def sumRange(from: Int, to: Int, acc: Int = 0): Int =
    if (to < from) acc
    else sumRange(from + 1, to, acc + from)
}
