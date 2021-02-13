object Fib {
    def fib(n: Int): Int = {
        @annotation.tailrec
        def go(a: Int, b: Int, x: Int): Int = 
            if (x <= 0) a
            else go(a + b, a, x - 1)

        go(0, 1, n)
    }
}
