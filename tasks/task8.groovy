import groovy.json.JsonSlurper


def parseAndFilterJson(str){
    result = [:]

    def jsonSlurper = new JsonSlurper()
    peoples = jsonSlurper.parseText(str)

    peoples.each{
        sum_of_numbers = it.value.toString().split('').collect {element -> return element.toInteger()}.sum()
        if(sum_of_numbers == 9)
            result.put(it.key, it.value)
    }

    return result
}

//print parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}")
return this
