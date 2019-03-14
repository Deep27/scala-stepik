package io.deep27soft.scalastepik._03_types._02_numbers

import scala.io.StdIn.readLine
import scala.math.BigDecimal.RoundingMode.HALF_UP

object Task {

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val dryCrisps: BigDecimal = weight * (1 - potatoWaterRatio)
    val dryCrispsWithWater = dryCrisps / (1 - crispsWaterRatio)
    dryCrispsWithWater.setScale(5, HALF_UP)
  }

  def main(args: Array[String]): Unit = {
    print(BigInt(readLine()).toString(2).count(c => c.equals('1')))
//    print(result)
//    val bigInt: BigInt = BigInt(readLine())
//    val binary: String = bigInt.toString(2)
//    val result = binary.count(c => c.equals('1'))
//    print(result)
  }
}
