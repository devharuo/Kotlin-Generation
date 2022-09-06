import kotlin.math.pow

/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

 */
fun main(){
    print("Digite um Número Inteiro:")
    val num1 = readln().toInt()

    print("Digite um Número Inteiro:")
    val num2 = readln().toInt()

    print("Digite um Número Inteiro:")
    val num3 = readln().toInt()

    if (num1 >= num2 && num1 >= num3)
        println("$num1 É o Maior Número.")
    else if (num2 >= num1 && num2 >= num3)
        println("$num2 É o Maior Número.")
    else
        println("$num3 É o Maior Número.")

}

