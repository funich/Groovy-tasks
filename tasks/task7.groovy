def a = "first second third"

def charToAScii = { chr -> ((int) chr).toString() }
def encryptWord = { word ->
    if (word.size() == 1) {
        return charToAScii(word)
    }
    def chars = word.split('')
    chars[0] = charToAScii(chars[0])
    def tmp = chars[1]
    chars[1] = chars[-1]
    chars[-1] = tmp
}

result = a.split().collect(encryptWord).join()

each{}