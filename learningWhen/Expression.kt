package learningWhen

class Expression {

    fun handle(obj: Any): Any {
        val result = when (obj) {                   // 1
            "Ikki" -> 1                              // 2
            2 -> "Mu"                            // 3
            is Long -> false                        // 4
            else -> 42                              // 5
        }
        return result
    }

}