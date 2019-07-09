import groovy.json.JsonSlurper

static def parseAndFilterJson(def str) {
    str = new JsonSlurper().parseText(str) //from string to map
    str = str.findAll {
       	def sum = 0
        (it.value).toString().each { sum = sum + it.toInteger() }
        sum == 9
    }
    return str
}

return this