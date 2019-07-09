import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(String text) {
    def jsonSlurper = new JsonSlurper()
    def parsing = jsonSlurper.parseText(text)
    def res = [:]
    parsing.each { name, years ->
        if (years.intdiv(10) + years % 10 == 9) {
            res.put(name, years)
        }

    }
    return JsonOutput.toJson(res)
}
return this


