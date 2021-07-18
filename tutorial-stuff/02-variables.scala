package foo.bar
package playground

object Main {

    // MAIN METHOD, ARGUMENTS => RETURN TYPE ARE SPECIFIED
    def main(args: Array[String]): Unit = {

        // DRAW LINE
        println("─" * 50)

        // ===================================================

        // VAL = IMMUTABLE VARIABLE (CONST)
        val foo = 1337
        println(foo)

        // VARIABLES CAN CONTAIN MULTIPLE THINGS
        // BUT ONLY THE LAST ONE IS RETURNED
        val bar = {
            println("something")
            6969
        }
        println(bar)


        // ===================================================
        println("─" * 50)
    
        // VAR = MUTABLE VARIABLE (LET)
        var biz = 55
        println(biz)

        // OVERWRITING BIZ
        biz = 75
        println(biz)

        // ===================================================
        println("─" * 50)

        // DEF = CONSTANT METHOD/FUNCTION
        // RECALCULATES CONTENT EVERY TIME
        def eyy = {
            println("cool function")
            191
        }
        println(eyy)
        println(eyy)

        // ===================================================
        println("─" * 50)

        // LAZY VAL = MEMOIZED METHOD/FUNCTION
        // RUNS THE FULL FUNCTION THE FIRST TIME
        // ONLY RETURNS RET VALUE ON SUBSEQUENT RUNTIMES

        lazy val lmao = {
            println("cool function")
            191
        }
        println(lmao)
        println(lmao)

        // ===================================================
        println("─" * 50)

        // VARIABLE TYPE SPECIFICATION
        val foobar: Int = 69
        println(foobar)

        // ===================================================
        println("─" * 50)

        // PASSING ARGUMENTS TO DEFS
        def func(p1: Int, p2: Int): Int = {
            p1 + p2
        }

        println(func(1, 2))

        // DRAW LINE
        println("─" * 50)
    }
}
