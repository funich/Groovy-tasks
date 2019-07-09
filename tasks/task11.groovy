def gstring(key, int pos){
    def text = "1() 2() 3()"

    return text.replace(/$pos()/,"$pos($key)")
}
println(gstring("test", 3))