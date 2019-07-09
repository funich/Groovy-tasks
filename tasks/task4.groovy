def fib(int num) {
    if (num == 0) {
        return num
    } else if (num == 1) {
        return num
    } else if (num > 1) {
        return fib(num - 1) + fib(num - 2)
    }
}
return this