def encryptThis(str){
    words = str.split(" ")
    result = [:]
    for(word in words){
        w = ""
        w += (int) word[0]
        w += word[-1]
        w += word[2..-2]
        w += word[1]
        result.put(word, w)
    }

    return result
}

//print encryptThis("hello world peace customer")
return this
