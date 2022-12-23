val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")

println(friends::class)
println(friends.javaClass)

println("${friends[0]} and ${friends[1]}")


val numbers = arrayOf(1, 2, 3)
println(numbers::class)
println(numbers.javaClass)


val numbers1 = intArrayOf(1, 2, 3)
println(numbers1::class)
println(numbers1.javaClass)

println(numbers1.size)
println(numbers.average())
println(Array(5) { i -> (i+1) * (i+1)}.sum())