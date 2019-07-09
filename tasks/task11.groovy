sample = "1() 2() 3()"

def String gstring(String string, int number) {
    return sample.replaceFirst(/${number}\(\)/, "${number}(${string})")
}

print(gstring("test", 2))
return this
