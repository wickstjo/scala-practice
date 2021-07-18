package foo.bar
package playground

object Args {

    // MAIN METHOD, ARGUMENTS => RETURN TYPE ARE SPECIFIED
    def main(args: Array[String]): Unit = {

        // DRAW LINE
        println("─" * 50)

        // PRINT ARG VALUES
        // ARGS ARE PASSED AFTER THE RUN COMMAND
        // ~run first second third
        println(args.mkString("\n"))

        // MORE EXENSIVE VERSION OF ^
        println(args.mkString(
            start="Array(",
            sep=", ",
            end=")"
        ))

        // DRAW LINE
        println("─" * 50)
    }
}
