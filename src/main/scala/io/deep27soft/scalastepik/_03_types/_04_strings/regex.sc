val input = "snake_case"
val regex = "^(?!_)([a-z]+|_(?!_))*[^_]$".r
val regex2 = "^[a-z]+(_[a-z]+)*?".r
println(regex2.pattern.matcher(input).matches)
