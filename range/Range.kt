package range

class Range {

    fun normal() {
        for(i in 0..3) {
            println(i)
        }
    }

    fun until() {
        for(i in 0 until 3) {
            println(i)
        }
    }

    fun step() {
        for(i in 2..8 step 2) {
            println(i)
        }
    }

    fun downTo() {
        for (i in 3 downTo 0) {
            println(i)
        }
    }

}