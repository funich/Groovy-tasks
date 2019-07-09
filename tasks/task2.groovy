
def mulEvenOdd(list) {
    list.eachWithIndex{ number, i, index = i + 1 ->
        if (i % 2 == 0) {
            list[i] *= 2
        } else {
            list[i] *= 3
        }
    }
    return list
}
return this
