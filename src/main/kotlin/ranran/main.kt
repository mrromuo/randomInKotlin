import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello World!")

    val myrandom = Random
    for (i in 1..10) println(myrandom.nextInt(1,4))

}