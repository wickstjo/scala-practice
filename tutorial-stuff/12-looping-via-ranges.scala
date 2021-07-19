package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // FOR LOOPS WITH RANGE
        Range(start=0, end=10).foreach(println)
        println("─" * 50)

        // WITH SPECIFICINCREMENT
        Range(start=0, end=10, step=2).foreach(println)
        println("─" * 50)

        // SYNTAX SUGAR
        // EXCLUSIVE & INCLUSIVE VARIANTS RESPECTIVELY
        println(0 to 9)
        println(0 until 9)
        println(0 to 9 by 2)

        println("─" * 50)

        // TRADITIONAL FOR LOOP
        for (i <- 0 to 9) {
            println(i)
        }

        println("─" * 50)

        // CONJUNCTION USAGE & YIELDING
        val chessboard = for(
            c <- 'a' to 'h';
            n <- 0 to 8
        ) yield c -> n

        println(chessboard)
    }
}
