package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        val fruits = List("apple", "orange", "banana")
        println(fruits)

        println("─" * 50)

        // PREPENDING A VALUE
        val foo = "melon" +: fruits
        println(foo)

        println("─" * 50)

        // APPENDING A VALUE
        val bar = fruits :+ "melon"
        println(bar)

        println("─" * 50)

        // CONCATING TWO LISTS
        val biz = List(1, 2, 3) ::: List(4, 5, 6)
        println(biz)

        println("─" * 50)

        // CONCATING OTHER COLLECTIONS
        val buz = Vector(1, 2, 3) ++ Vector(4, 5, 6)
        println(buz)

        println("─" * 50)

        // APPENDING TO A SET
        val set1 = Set(1, 2, 3)
        println(set1)
        val set2 = set1 +0
        println(set2)

        println("─" * 50)

        // APPENDING TO A MAP
        val map1 = Map(
            (1 -> "I"),
            (2 -> "II"),
            (3 -> "III")
        )
        println(map1)

        val map2 = map1 + (4 -> "IV")
        println(map2)

        println("─" * 50)

        // CONVERTING BETWEEN COLLECTION TYPES
        println(set1)
        val vect = set1.to(Vector)
        println(vect)

        println("─" * 50)
    }
}
