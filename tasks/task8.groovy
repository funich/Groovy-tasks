import groovy.json.JsonSlurper
import groovy.json.JsonOutput
def parseAndFilterJson(text){

    def jsonS = new JsonSlurper()

    def  js = jsonS.parseText(text)

    assert js instanceof Map

    def result = [:]

    js.each { k, v ->
           if (v % 3 == 0) {
           result.put(k, v)
        }
    }
    def json = JsonOutput.toJson(result)
    return json
}
return this
