package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // NORMAL ARRAY
        val fruits = Array("apple", "orange", "banana")
        
        // FETCH VALUE BY INDEX
        println(fruits(2))

        // ASSIGN VALUE TO INDEX
        fruits(2) = "melon"
        println(fruits(2))

        println("─" * 50)

        // LOOP THROUGH ALL
        fruits.foreach(println)
    
        println("─" * 50)

        // REVERSE EACH VALUE
        fruits.mapInPlace(_.reverse).foreach(println)

        // MAP & FILTER METHODS -- SAME AS JAVASCRIPT
        fruits.map(_ + "foo").foreach(println)
        fruits.filter(_ % 2 != 0).foreach(println)
    }
}
