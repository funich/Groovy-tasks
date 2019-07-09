def adults(List list){

    def approved = [:]
    list.each { key, value ->
        if(value >= 18) approved.put(key, value)
    }

    return approved
}

//println(adults([Kate: 18, Henry: 16, Lucas: 89]))

return this