def gstring(str, position){
    result = ""
    for(int i = 1; i <= 3; i++){
        word = ''
        if(i == position)
            word = str
        result += "${i}(${word}) "
    }
    return result.trim()
}

//print gstring("test", 2)
return this
