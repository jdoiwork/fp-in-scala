object Ex2 {
    def fib(n: Int): Int = {
        @annotation.tailrec
        def go(a: Int, b: Int, x: Int): Int = 
            if (x <= 0) a
            else go(a + b, a, x - 1)

        go(0, 1, n)
    }

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

    def curry[A, B, C](f: (A, B) => C): A => (B => C) =
        (a: A) => (b: B) => f(a, b)
}
