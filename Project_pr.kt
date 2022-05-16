import kotlin.ranges.random as random1

val input = mutableListOf("34") // загадане число яке вводиться
private fun readLine(): String? {
    val line = input.firstOrNull()
    input.removeAt(0)
    return line
}



fun main() {
    println("player 1 enter a number")
    val randval1 = readLine()?.toInt()
    println(randval1)
    do {
        println("player2 guess the number")
        //програма починає вгадувати

        val rvalfor1 = (-2..1).random1() /* рандом на додавання якщо
        rvalfor1 = 0 то randval1 + 0 = randval1 = win */
        val num = randval1?.plus(rvalfor1) // вгадуване число
        println(num)

        if (num == randval1) {
            println("player2 won!!!")
        } else if (num != null) {
            if (num > randval1!!) {
                println("the number is too large: \n")
            } else {
                println("the number is too small: \n")
            }
        }
    } while (num != randval1)
    println("\n\n")




    println("player 2 enter a number")
    val randval2 = (0..100).random1() // загадуючий рандом
    println(randval2)
        do {
            println("player1 guess the number")

            val rvalfor2 = (-1..1).random1() // рандом на додавання до загадуючого рандому

            val num = randval2?.plus(rvalfor2) // вгадуване число
            println(num)

            if (num == randval2) {
                println("player2 won!!!")
            } else if (num != null) {
                if (num > randval2!!) {
                    println("the number is too large: \n")
                } else {
                    println("the number is too small: \n")
                }
            }
        } while (num != randval2)
}



