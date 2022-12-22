val oneToFive: IntRange = 1..5 // 1..5
val aToE: CharRange = 'a' .. 'c' // 'a'..'e'
val seekHelp: ClosedRange<String> = "hell".."help"

println(seekHelp.contains("helm")) // true
println(seekHelp.contains("helq")) // false

for (i in oneToFive) { print("$i, ")}
for (i in 1..5) {print("$i, ")}

for (i in aToE) { print("$i, ")}
for (i in 'a'..'e') { print("$i, ")}
