package functions

class HigherOrderFunctions {

    fun square(x: Int) = x * x

    fun mult(x: Int, y: Int) = x * y

    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }

    fun calculateSquare(x: Int): (Int) -> Int {
        return ::square
    }

    fun main() {
        val first = calculate(18, 27, ::mult)
        val second = calculateSquare(9)

        println("first: $first, second: $second")
    }

}