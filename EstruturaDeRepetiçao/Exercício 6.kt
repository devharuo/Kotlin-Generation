
    fun main() {

        var soma = 0
        var multiplosDe3 = 0

        do {
            print("Digite um número diferente de 0: ")
            val numero = readln().toInt()

            if (numero != 0 && numero % 3 == 0) {
                soma += numero
                multiplosDe3++
            }

        } while (numero != 0)

        val media = soma / multiplosDe3

        println("Digitaram $multiplosDe3 números múltiplos de três e a média foi de $media")
    }
