def sumEven(n: Int): Int = {
  def go(i: Int): Int =
    if (i > n) 0
    else i + go(i + 2)
  go(2)
}

def sumEvenTail(n: Int): Long = {
  def go(i: Int, acc: Long = 0): Long = {
    if (i > n) acc
    else go(i + 2, acc + i)
  }
  go(2)
}

sumEven(100)
sumEven(10000)
sumEvenTail(10000)
sumEvenTail(100000)
