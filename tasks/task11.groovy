sample = "1() 2() 3()"

def gstring(String str, int n){

    def oldVal = n.toString()+ /()/
    def newVal = n.toString() + "(${str})"
    return sample.replace(oldVal, newVal)

}

//println(gstring("fdgdfg", 1))

return this