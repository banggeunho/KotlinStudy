fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
    "Saturday", "Sunday" -> "Relax"
    in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work Hard"
    in 2..4 -> "Work Hard"
    "Friday" -> "Party"
    is String -> "What?"
    else -> "No clue"
}

println(whatToDo("Sunday")) //Relax
println(whatToDo("Wednesday")) // Work Hard
println(whatToDo(3)) // work Hard
println(whatToDo("Friday")) // Party
println(whatToDo("Munday")) // What?
println(whatToDo(8)) // No clue