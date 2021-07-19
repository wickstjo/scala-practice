package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // PATTERN MATCHING WITH CASES
        val result = List(1, 2, 3, 4, 5, 6, 7, 8, 9) match {

            // IF THE LIST PATTERN MATCHES & THE IF STATEMENT IS TRUE
            case List(_, _, third, fourth, _*) if third == fourth -1 => true
            
            // DEFAULT BASECASE
            case _ => false
        }

        println(result)

        println("─" * 50)

        // PATTERN MATCHING FOR VALS
        // PSEUDO DESTRUCTURE
        val List(_, second, third, rest @ _*) = List(1, 2, 3, 4, 5)

        println(second)
        println(third)
        println(rest)
    }
}
