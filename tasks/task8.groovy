import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(text){

    def jsonS = new JsonSlurper()

    def  js = jsonS.parseText(text)

    assert js instanceof Map

    def result = [:]

    '''def summ = each { return sum+= it as Integer }'''

    js.each { k, v ->
            def sum = 0
            def l = v.toString().split("")
            println(l)
            l.each { sum+= it as Integer }
           if ( sum == 9) {
           result.put(k, v)
        }
    }
    def json = JsonOutput.toJson(result)
    return json
}

return this
