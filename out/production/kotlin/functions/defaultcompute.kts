// 기본 아규먼트는 값일 필요가 없다, 표현식이 올 수도 있음.
fun greet(name: String, msg: String = "Hi ${name.length}") = "$msg $name"
println(greet("Scott", "Howdy"))
println(greet("Scott"))