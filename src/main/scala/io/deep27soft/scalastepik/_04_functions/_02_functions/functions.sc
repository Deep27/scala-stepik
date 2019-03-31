
val predicate: Int => Boolean = x => x % 2 == 1
val predicate2: Int => Boolean = _ % 2 == 1
val predicate3 = (i: Int) => i % 2 == 1

List(1,2,3).filter(x => x % 2 == 1)
List(1,2,3).filter(_ % 2 == 1)
List(1,2,3).filter(predicate)
List(1,2,3).filter(predicate2)

val searchInArray: (Int => Boolean, List[Int]) => List[Int] =
  (cond, list) => list.filter(cond)
searchInArray.curried

val searchOdd = (list: List[Int]) => searchInArray(_ % 2 == 1, list)
val searchOddCurried = searchInArray curried (_ % 2 == 1)

searchOdd(List(1, 2, 3, 4, 5))
searchOddCurried(List(1, 2, 3, 4, 5))

val add1 = (_: Int) + 1
val addStr = (_ : String) + "123"
val calc42 = (f: Int => Int) => f(42)
calc42(add1)
// calc42(addStr) // type mismatch
calc42(x => {
  var y = x
  for (_ <- 1 to 3) {
    y = x * x
  }
  y
})

def sumTo(x: Int): Int = if (x == 0) 0 else x + sumTo(x - 1)
calc42(sumTo)
def fix(f: (=> Int => Int) => Int => Int): Int => Int = f(fix(f))
fix(rec => x => if (x == 0) 0 else x + rec(x - 1))(7)
calc42(fix(rec => x => if (x == 0) 0 else x + rec(x - 1)))
