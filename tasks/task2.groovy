def mulEvenOdd(List list) {

    for(int i = 0; i < list.size(); i++) {
        if(list[i] % 2 == 0) {
            list[i] *= 2
        }
        else list[i] *= 3
    }

    return list
}

//println(mulEvenOdd([1, 2, 3, 4, 5]))

return this