fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
    println("$name $age $height $weight")
}

createPerson("Kale", 12, 153, 43)
// 명시적 아규먼트를 이용한 가독성 향상 (named argument)
createPerson( name = "Jake", age = 12, height = 185, weight = 82)
