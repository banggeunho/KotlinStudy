fun getFullName() = Triple("John", "Quincy", "Adams")

val result = getFullName()
//val first = result.first
//val middle = result.second
//val last = result.third
//
//println("$first $middle $last")


//val (first, middle, last) = getFullName()
//println("$first $middle $last")

//val (first, _, last) = getFullName()
//println("$first $last")

// 값을 받ㄱ ㅣ 싫으면 언더스코어를 싸용하면된다.
val (_, _, last) = getFullName()
println(last)

// 이후 부터 값을 받기 싫으면, 그냥 안 적으면 된다.
val(_,middle) = getFullName()
println(middle)