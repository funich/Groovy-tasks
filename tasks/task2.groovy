def mulEvenOdd(def list) {
    list.eachWithIndex { it, index ->
        if (it % 2 == 0) {
            list[index] = it * 2
        }
        else
            list[index] = it * 3
    }
  	return list
}

return this
