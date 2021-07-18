package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // IF STATEMENT RESULT MUST BE SAVED IN A VARIABLE
        // WITH OR WITHOUT BRACKETS -- DOES NOT MATTER
        val result1 = if (false) "good" else "bad"
        println(result1)

        // ===================================================
        println("─" * 50)

        // TRUE OR DIE STATEMENT
        val result2 = if (true)
            "foobar"
        else
            throw new Exception
        
        println(result2)
    }
}
