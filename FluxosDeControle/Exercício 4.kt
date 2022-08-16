import kotlin.math.pow
import kotlin.math.sqrt

/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

fun main(){

                println("Digite um Número qualquer: ")
                        val num = readln().toInt()

        if(num % 2 == 0){
                println("O Número $num é Par e sua raiz quadrada é: ${sqrt(num.toDouble())}")
        }else{
                println("O Número $num é Ímpar e sua raiz quadrada é: ${num.toDouble().pow(n =2)}")
        }





}