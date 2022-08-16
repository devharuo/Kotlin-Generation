
/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto

 */



fun main(args: Array<String>) {

        print("Digite a sua Idade para saber sua categoria: ")
        val idade = readln().toDouble()



        if(10 <= idade && idade <= 14){
                println("Você está na categoria Infantil.")

        }else if(15 <= idade && idade <= 17){
                println("Você está na categoria Juvenil.")

        }else if (18 <= idade){
                println("Você está na categoria Adultos.")
        }
}



















