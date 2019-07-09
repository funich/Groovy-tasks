import groovy.json.JsonSlurper;
import groovy.json.JsonOutput;

def parseAndFilterJson(String str){

    def jsonSlurper = new JsonSlurper()
    def list = jsonSlurper.parseText(str)

    def approved = [:]
    list.each { key, value ->
        if((value%10)+(value.intdiv(10)) == 9) approved.put(key, value)
    }

    return JsonOutput.toJson(approved)

}

return this