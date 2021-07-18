package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {

        // DRAW LINE
        println("─" * 50)

        // SINGLE QUOTES FOR CHARACTERS (INCLUDING UNICODE)
        val foo = 'a'
        println(foo)

        // DOUBLE QUOTES FOR STRINGS
        val bar = "something"
        println(bar)

        // ===================================================
        println("─" * 50)

        // PRINTING STRINGS AND VARIABLES
        val biz = 1664
        println(s"this is a number: ${ biz.toString }")
        
    }
}
