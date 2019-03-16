package io.deep27soft.scalastepik._04_functions._01_methods

object Bank {

  def main(args: Array[String]): Unit = {

    val accountAmounts = List(100, 200, 500, 300, 700)
    val newAmounts = accountAmounts.map(amount => sendGift(amount, getGift()))
  }

  def getGift(): Int = {
    ???
  }

  def sendGift(currentAmount: Int, gift: => Int) = {
    if (currentAmount >= 500)
      currentAmount + gift
    else currentAmount
  }
}
