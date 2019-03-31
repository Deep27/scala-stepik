package io.deep27soft.scalastepik._05_operators._01_control_structures

import scala.io.StdIn.readLine

object Task {

  def main(args: Array[String]): Unit = {

    def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)

    val n = BigInt(readLine())
    println(n.isProbablePrime(0))
  }
}
