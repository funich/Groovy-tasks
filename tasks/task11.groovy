def String gstring(String string, int number) {
    def string1 = ''
    def string2 = ''
    def string3 = ''

    if (number == 1) {
        string1 = string ?: ''
    } else if (number == 2) {
        string2 = string ?: ''
    } else {
        string3 = string ?: ''
    }

    return "1($string1) 2($string2) 3($string3)"
}

return this
