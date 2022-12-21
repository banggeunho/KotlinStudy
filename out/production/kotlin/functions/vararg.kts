fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}

println(max(1, 2, 3, 4))
println(max(1, 5, 2, 12, 7, 3))

val values = intArrayOf(1, 21, 3)

println(max(values[0], values[1], values[2]))

// * 연산자를 이용해서 배열을 넘길 수 있다.
// * 연산자는 배열의 값들을 추출해서 vararg 파라미터에 다중인자로 넘기라고 요청하게 되는 것
println(max(*values))
// 보통 list를 많이 사용한다. 배열로 바꾼 후 * 연산자를 통해 넘긴다.
println(max(*listOf(1, 4, 18, 12).toIntArray()))
