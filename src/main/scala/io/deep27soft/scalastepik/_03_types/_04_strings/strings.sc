val x = BigInt(2).pow(1000000).toString()

x.contains("777")

val reg = "(.)\\1\\1\\1\\1\\1".r

reg.findFirstIn(x)

val str = "Straight"
val substr = str.substring(2, 4)
val splitted = str.split(substr)
val newString = splitted(0) + substr.reverse + splitted(1)
