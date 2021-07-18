package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // RECURSION LOOP
        // ANNOTATION THING PREVENTS WARNING
        @annotation.tailrec
        def loop(acc: Int): Unit =
            if (acc < 10) {
                println(acc)
                loop(acc + 1)
            }

        loop(0)

        println("─" * 50)

        // WHILE LOOP
        // CONSIDERED BAD, USUALLY NOT USED
        var bar = 0

        while (bar < 10) {
            print(bar)
            bar += 1
        }

        println("─" * 50)

        // FOREACH LOOP
        List(1, 2, 3).foreach[Unit](println)
    }
}
