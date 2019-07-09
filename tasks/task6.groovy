def adults(list) {

    def approved = [:]
    list.each { key, value ->
        if(value >= 18) approved.put(key, value)
    }

    return approved
}


return this