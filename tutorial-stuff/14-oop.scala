package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // BASIC OOP CLASS
        // CONSTRUCTOR IN DECLARATION
        class Calculator(a: Int) {

            // A IS AUTOMATICALLY ASSIGNED WITHIN THE CLASS
            // THE VARIABLE IS PRIVATE BY DEFAULT

            // METHOD
            def add(b: Int): Int = a+b
        }

        // CREATE INSTANCE & USE METHOD
        val c1 = new Calculator(5)
        println(c1.add(5))

        println("─" * 50)

        // THE PREVIOUS METHOD IS CONSIDERED BAD PRACTICE
        // SINCE IT DOES NOT FOLLOW FUNC. PROGRAMMING GUIDELINES
        // A BETTER CHOICE IS A CLASS OF METHODS
        class Calc() {
            def add(a: Int, b: Int): Int = a+b
        }

        // CREATE INSTANCE & USE METHOD
        val c = new Calc()
        println(c.add(2, 5))

        println("─" * 50)

        // ALTERNATIVELY, JUST MAKE AN OBJECT
        // THAT DOES NOT HAVE TO BE INSTANTIATED
        object calc {
            def add(a: Int, b: Int): Int = a+b
        }

        println(calc.add(2, 2))

        println("─" * 50)
    }
}
