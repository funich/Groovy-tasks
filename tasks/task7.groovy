def encryptThis(str){
    words = str.split(" ")
    result_words = ""
    first_word = true
    for(word in words){
        w = first_word ? "" : " "
        first_word = false
        w += (int) word[0]
        w += word[-1]
        w += word[2..-2]
        w += word[1]
        result_words += w
    }
    return result_words
}

//print encryptThis("hello world")
return this
