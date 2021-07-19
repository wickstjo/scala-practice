package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // TRY SOMETHING
        try {
            println(1/0)
       
        // CATCH THE ERROR
        } catch {
            case e: ArithmeticException => println(Console.YELLOW + e.toString + Console.RESET)
        
        // REGARDLESS, FINALLY DO SOMETHING
        } finally {
            println("process finished")
        }

        println("─" * 50)
    }
}
