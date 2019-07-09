def encryptThis(text){
    def words = text.split(' ')
    def toAscii = { ch -> ((int) ch).toString() }
    def result = ''
    def pars = { word ->
        word = word.split ('')
        if (word.size() == 1){
            return toAscii(word)

        }
        else {
            word[0] = toAscii(word[0])
            def flag = word[1]
            word[1] = word[-1]
            word[-1] = flag
            return word.join()
        }
    }
    words.each{ word-> result+=' '+( pars(word))}
    return result

}

return this