import kotlin.math.pow

fun main() {

    /* Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele.
     */

    val pi = 3.14

    print("Digite o diâmetro do círculo: ")

    val diam = readln().toDouble()
    val raio = diam / 2
    val area = pi * raio.pow(n= 2)
    val perim = 2 * pi * raio


    //format - padrao.format(numero)
    println("A Área do Círculo é: ${"%.2f".format(area)}")
    println("O Perímetro do Círculo é: ${"%.2f".format(perim)}")














}