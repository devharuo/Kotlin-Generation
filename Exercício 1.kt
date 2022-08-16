import java.time.LocalDate

fun main() {
   /* 1- O usuário digitará sua idade e o programa deveraá printar o ano em que ele nasceu. */


    // LocalDate
    val ano = LocalDate.now().year

    println(ano)

    print("Você já fez aniversário este ano? (s/n) ")

    val resp = readln()

    val fezAniversario: Boolean = false

    var nasc: Int

    print("Digite a sua idade: ")

    val idade = readln().toInt()

    if (resp == "s"){
        fezAniversario == true
        nasc = ano - (idade-1)

    }else{
        nasc = ano - (idade +1)
    }



    println("O seu ano de nascimento é: $nasc")

}