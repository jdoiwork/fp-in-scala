object Ex2_2 {
    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        @annotation.tailrec
        def go(i: Int): Boolean = 
            if (i + 1 >= as.length)
                true
            else if (ordered(as(i), as(i + 1)))
                go(i + 1)
            else
                false
        go(0)
    }
}
