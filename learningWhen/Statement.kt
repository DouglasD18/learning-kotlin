package learningWhen

class Statement {

    fun handle(obj: Any) {
        when (obj) {                                     // 1
            3 -> println("Win")                          // 2
            "Gon" -> println(1)              // 5
            else -> println("Unknown")                   // 6
        }
    }

}