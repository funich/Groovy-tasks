def adults(peoples){
    result = [:]
    peoples.each{
        if(it.value >= 18)
            result.put(it.key, it.value)
    }
    return result
}

//print adults([Kate: 24, Alan:16, Osvald: 18])
return this
