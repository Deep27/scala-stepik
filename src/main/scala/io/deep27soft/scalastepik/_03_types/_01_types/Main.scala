package io.deep27soft.scalastepik._03_types._01_types

object Main extends App {

//  val message: AnyRef = "Hello, Scala!"
//  val message2: String = message // type mismatch

  val message: String = "Hello, Scala!"
  val message2: String = message
  println(message2)

  val message3 = Math.acos(1.0)
  println(message3)

  val message4: String = "Message 4"
  val message5: Any = message4
  val message6: Any = Math.acos(1.0)
  println(message6)

  val message7: Unit = Math.acos(1.0)
  println(message7)

  val message8: Unit = println("A Unit")
  println(message8)

  val message9: Double = {
    val x = 1.0
    Math.acos(x)
  }
  println(message9)
}
