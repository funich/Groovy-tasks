int[] mulEvenOdd(int[]arr){
    int[] result=[]
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