package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // FUNCTIONS THAT TAKE FUNCS AS ARGS
        // HIGHER ORDER FUNCTIONS
        def primary(func: Int => String): Unit = {
            println(func(5))
        }

        // INNER FUNCTION TO CALL
        def secondary(value: Int): String = {
            Console.YELLOW + value.toString + Console.RESET
        }

        // CALL PRIMARY FUNC BY PASSING SECONDARY FUNC
        primary(secondary)

        println("─" * 50)

        // ARROW FUNCTION
        val func2 = x =>secondary(x)
        println(func2(5))
    }
}
