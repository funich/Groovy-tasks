def String encryptThis(String string) {
    words = string.split()

    list_of_encrypted_words = []
    words.each { word ->
        if (word.size() == 1) {
            encrypted_word = ((int) word).toString()
        } else {
            encrypted_word = word.split('')
            encrypted_word[0] = ((int) encrypted_word[0]).toString()
            temp = encrypted_word[1]
            encrypted_word[1] = encrypted_word[-1]
            encrypted_word[-1] = temp
        }
        list_of_encrypted_words.add(encrypted_word.join())
    }

    return list_of_encrypted_words.join(' ')
}

return this
