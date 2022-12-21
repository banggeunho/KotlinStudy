fun nofluff() {
    println("nofluff called....")
    throw java.lang.RuntimeException("oops")
}

println("not in a funtion, calling nofluff()")

try{
    nofluff()
} catch (ex: Exception) {
    val stackTrace = ex.stackTrace
    println(stackTrace[0])
    println(stackTrace[1])
}