#!/usr/bin/env kotlinc-jvm -script
// p44
val greet = "hello"
println(greet)
println(greet::class) // 변수에 의해 참조되고 있는 코틀린 클래스를 확인
println(greet.javaClass)