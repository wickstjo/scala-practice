package foo.bar
package playground

object Main {

    // MAIN METHOD
    def main(args: Array[String]): Unit = {
        println("─" * 50)

        // IMPORTING SCALA COLLECTIONS
        import scala.collection.mutable
        import scala.collection.immutable

        // USING ONE
        val bla = mutable.ArraySeq(1, 2, 3)
        println(bla)
    
        println("─" * 50)

        // BASIC SEQUENCE -- USES LIST DS
        // TRAVERSES THE SEQUENCE WHEN FETCHING
        val seq1 = Seq(1, 2, 3)
        println(seq1)
        println(seq1(2))
        
        println("─" * 50)

        // INDEXED SEQUENCES -- USES VECTOR DS
        // SIGIFICANTLY FASTER AT FETCHING -- UNDER THE HOOD
        val seq2 = IndexedSeq(1, 2, 3)
        println(seq2)
        println(seq2(2))

        println("─" * 50)

        // SETS ARE UNORDERED AND CANNOT CONTAIN MULTIPLES
        // MUTABLE VERSION
        val set1 = Set(1, 2, 3, 1, 4, 2, 3, 6)
        println(set1)

        println("─" * 50)

        // IMMUTABLE SET
        val set2 = immutable.HashSet(1, 2, 3, 1, 4, 2, 3, 6)
        println(set2)

        println("─" * 50)

        // MUTABLE HASHMAP
        val map1 = Map(
            ("foo", "bar"),
            ("biz", "buz"),
            ("eyy", "lmao")
        )

        println(map1)
        println(map1("foo"))

        println("─" * 50)

        // IMMUTABLE HASHMAP
        val map2 = immutable.Map(
            ("foo", "bar"),
            ("biz", "buz"),
            ("eyy", "lmao")
        )

        println(map2)
        println(map2("foo"))

        println("─" * 50)
    }
}
