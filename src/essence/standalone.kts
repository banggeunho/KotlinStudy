fun nofluff() {
    println("nofluff called....")
    throw java.lang.RuntimeException("oops")
}

println("not in a funtion, calling nofluff()")

try{
    nofluff()
} catch (ex: Exception) { // runtimeException 은 Exception에 상속되어 있어 사용 가능
    val stackTrace = ex.stackTrace
    println(stackTrace[0])
    println(stackTrace[1])
}