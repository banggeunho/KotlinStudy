for (i in 1 until 5) { print("$i, ")}
println()
// step 추가
for (i in 1 until 10 step 3) {print("$i, ")}
println()
for (i in 10 downTo 0 step 3) {print("$i, ")}

// filter 사용

for (i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
    print("$i, ") // 3, 5, 6, 9
}