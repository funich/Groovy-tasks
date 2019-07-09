def isSublist(first, second){
    for(def i = 0; i < first.size() - second.size() + 1; i++){
        isSub = true
        for(def j = 0; j < second.size(); j++){
            if(first[i + j] != second[j]){
                isSub = false
                break
            }
        }
        if(isSub){
            return true
        }
    }
    return false
}

//print isSublist([1,2,3,4,5,6], [1,2,3,5])
return this
