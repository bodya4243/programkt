import kotlin.ranges.random as random1

fun main() {
    val randval1 = (0..100).random1()
    println("player 1 enter a number")
    //println(randval1)
    println("...")

    println("player2 guess the number")
    //програма починає вгадувати
    val rvalfor2 = (-2..1).random1() // рандом на додавання до вгадуючого рандому

    val num = randval1 + rvalfor2 // вгадуване число
    println(num)


    //умова ---
    if (num == randval1) {
        println("player2 won!!!")

        val randval1 = (0..100).random1()
        println("-----------------------------")

        println("player 2 enter a number")
        //println(randval1)
        println("...")
        do {
            println("player1 guess the number")

            val rvalfor2 = (-2..1).random1() // рандом на додавання до вгадуючого рандому

            val num = randval1 + rvalfor2 // вгадуване число
            println(num)

            if (num == randval1) {
                println("player1 won!!!")
            } else if (num > randval1) {
                println("the number is too large:")
            } else {
                println("the number is too small:")
            }
        } while (num != randval1)
    } else if (num > randval1) {
        println("the number is too large:")
    } else {
        println("the number is too small:")
    }

}


