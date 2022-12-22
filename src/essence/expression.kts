
fun canVote(name: String, age: Int):String {
    val status = if(age > 17) "yes, please vote" else "nope, please come back" // 표현식으로 작성
    return "$name, $status"
}

print(canVote("geunho", 18))
