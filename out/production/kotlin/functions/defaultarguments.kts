fun greet(name: String, msg: String = "Hello"): String = "$msg $name"

println(greet("Geunho"))
println(greet("Geunho", "King"))