def mulEvenOdd(array){
    def result = []
    for(int i in array) {
        if(i % 2 == 0)
            result.add(i * 2)
        else
            result.add(i * 3)
    }
    return result
}

//print mulEvenOdd([1,2,3])
return this
