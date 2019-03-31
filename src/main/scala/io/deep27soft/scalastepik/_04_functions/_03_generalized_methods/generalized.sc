def ifThenElseInt(cond: Boolean)
                 (t: => Int, e: => Int): Int = if (cond) t else e
def ifThenElseString(cond: Boolean)
                 (t: => String, e: => String): String = if (cond) t else e
def ifThenElseLong(cond: Boolean)
                 (t: => Long, e: => Long): Long = if (cond) t else e

def ifThenElse[A](cond: Boolean, t: => A, e: => A): A = if (cond) t else e

ifThenElse[String](1 > 2, "one", "two")
ifThenElse[Int](1 > 2, 1, 2)

ifThenElse(1 > 2, "one", "two")
ifThenElse(1 > 2, 1, 2)

def combineOn[A, B](comb: (B, B) => B)
                   (f: A => B, g: B => A)
                    : (A, A) => A =
  (x, y) => g(comb(f(x), f(y)))

val sumStrings = combineOn[String, Int](_ + _)(_.toInt, _.toString)
val sumStrings2 = combineOn[String, Int]((x, y) => x + y)(_.toInt, _.toString)

sumStrings("123", "32")
