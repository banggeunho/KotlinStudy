fun f1() = 2
fun f2() = { 2 }
fun f3(factor: Int) = {n: Int -> n * factor}
println(f1())
println(f2()) // ()-> kotlin.Int => 람다 표현식으로 추론
println(f2()()) //
println(f3(2))
println(f3(2)(3))