def encryptThis(String str) {
    def a = str.split()

    def charToAscii = { chr ->
        ((int) chr).toString()
    }
    def encryptWord = { word ->
       if (word.size() == 1) {
           return charToAscii(word)
        }
        def chars = word.split()
        chars[0] = charToAscii(chars[0])
        def tmp = chars[1]
        chars[1] - chars[-1]
        chars[-1] = tmp
        return chars.join("")
        }
    return a.collect(encryptWord.join(""))
}
return this