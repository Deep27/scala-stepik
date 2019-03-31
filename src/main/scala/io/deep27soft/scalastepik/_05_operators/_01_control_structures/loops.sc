for (i <- 1 to 10) {
  println(i)
}

for (i <- 1 to 10; j <- i to 10) {
  println(s"$i $j")
}

for {
  i <- 1 to 10
  j <- i to 10
} println(s"$i $j")

for {
  i <- 1 to 10
  j <- i to 10 if i > j
} println(s"HEY: $i $j")

for (i <- Range(1, 10)) {
  println(i)
}

for (i <- 1 until 10) {
  println(i)
}
