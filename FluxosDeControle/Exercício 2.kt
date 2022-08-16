
/* 2- Faça um programa que entre com três números e coloque em ordem crescente.

 */


fun main(args: Array<String>) {


        print("Digite um Número Inteiro:")
        val num1 = readln().toInt()

        print("Digite um Número Inteiro:")
        val num2 = readln().toInt()

        print("Digite um Número Inteiro:")
        val num3 = readln().toInt()

        val numsList = listOf(num1, num2, num3)

        val sortAscOr = numsList.sorted()
        println(sortAscOr)
    }

