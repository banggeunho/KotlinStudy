fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
    if (numberOfLiveNeighbors < 2) { return false }
    if (numberOfLiveNeighbors > 3) { return false }
    if (numberOfLiveNeighbors == 3) {return true }
    return alive && numberOfLiveNeighbors == 2
}

println(isAlive(true, 2)) // true
println(isAlive(false, 4)) // false