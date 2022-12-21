fun max(numbers: IntArray): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}

print(max(intArrayOf(1, 5, 7, 2, 12, 7, 3)))