package exceptions

class NewException {

    @Throws(IllegalArgumentException::class)
    fun vote(name: String, age: Int) {
        if (age < 16) {
            throw IlegalVoterException("Apenas pessoas com 16 ou mais podem votar!")
        }
        println("$name votou com sucesso!")
    }

    fun main() {
        vote("Douglas", 18)
        vote("Diana", 14)
    }
}
