package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {

        // DRAW LINE
        println("─" * 50)

        // ===================================================

        // THE TYPE NOTHING HAS NO VALID VALUES
        // THE ONLY MATCH IS A THROWN EXCEPTION

        // val foo: Nothing = throw new Exception
        // NO CODE WILL EXECUTE AFTER THIS LINE


        // ===================================================
        println("─" * 50)

        // UNIT TYPE
        // ONLY MATCHES ONE VALUE
        val bar: Unit = ()
        println(bar)

        // ===================================================
        println("─" * 50)

        // NULL TYPE
        // ONLY MATCHES ONE VALUE
        val biz: Null = null
        println(biz)

        // ===================================================
        println("─" * 50)

        // BOOLEAR TYPE
        val yes: Boolean = true
        println(yes)

        // ===================================================
        println("─" * 50)

        // BYTE IS A BUILT IN OBJECT
        // MIN VALUE FETCHES ITS SMALLEST POSSIBLE VALUE
        // ALL OTHER C++ VARIABLE TYPES ARE ALSO AVAILABLE
        val min: Byte = Byte.MinValue
        println(min)

        // ===================================================
        println("─" * 50)

        // HEXADECIMAL NUMBERS
        val hexa = 0xf
        println(hexa)

        // ===================================================
        println("─" * 50)

        // TYPES CAN BE ALIASED
        type N = Int
        val fav: N = 1652
        println(fav)

        // ===================================================
        println("─" * 50)

        // TOO LARGE NUMBERS FOR VARIABLE
        // A RETURN TYPE DOES NOT SUFFICE
        // MUST USE A SPECIFIC SUFFIX
        val a_long = 9223372036854775807L
        println(a_long)

        val a_float = 9223372036854775807f
        println(a_float)
        
        val a_double = 9223372036854775807d
        println(a_double)

        // DRAW LINE
        println("─" * 50)
    }
}
