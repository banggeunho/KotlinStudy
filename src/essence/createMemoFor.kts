fun createMemoFor(name: String): String {
    if(name == "Eve") {
        val memo = """ Dear $name, a quick reminder about the
            | party we have scheduled next Tuesday at
            | the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
// |이건 줄바꿈 """ 쌍따옴표 세개는 다 작성 가능..
        return memo.trimMargin()
    }
    return ""
}

println(createMemoFor("Eve"))