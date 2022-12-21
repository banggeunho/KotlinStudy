val price = 12.25
val taxRate = 0.08

// 문자열 템플릿 $ 심볼을 이용하여, 문자열 내의 변수를 사용한다.
val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
val disclaimer = "The amount is US$, that`s right in \$only"
println(output)
println(disclaimer)