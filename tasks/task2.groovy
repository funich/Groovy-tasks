def mulEvenOdd(int[]arr){
    def result=[]
    arr.each {
        if (it%2==0){
            it*=2
        }
        else{
            it*=3
        }
    result << it
    }
    return result
}
return this
