val x = 0xF
val y = 0xA1

x >> y // побитовый сдвиг вправо
x << y // побитовый сдвиг влево
x | y  // побитовое ИЛИ
x & y  // побитовое И
x ^ y  // побитовое ИСКЛ.ИЛИ
~x     // побитовая инверсия

// порядок операций
//  1. символы
//  2. |
//  3. ^
//  4. &
//  5. =!
//  6. <>
//  7. :
//  8. +-
//  9. */%
//  10. все остальные знаки

val bi = BigInt(10)
val bd = BigDecimal(10)
val bi2 = BigInt("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
println(bi2)
val bi2pwd = bi2 pow 10
println(bi2pwd)
val gcd = bi2 gcd bi2pwd
println(gcd)

((1: Short) + (1: Short)).toShort
('A'.toInt + 10).toChar

BigInt(256345343).toString(2)
