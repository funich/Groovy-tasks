
def mulEvenOdd(list) {
    list.eachWithIndex { item, index ->
        if (item % 2 != 0) {
            list[index] *= 3
        } else {
            list[index] *= 2
        }
    }
    return list
}
return this
