import groovy.json.JsonSlurper;
import groovy.json.JsonOutput;

jsonSlurper = new JsonSlurper()

def parseAndFilterJson(String str){

    def list = jsonSlurper.parseText(str)

    def approved = [:]
    list.each { key, value ->
        def dig_sum =  Integer.toString(value).collect{ Integer.parseInt(it) }.sum()
        if(dig_sum == 9) approved.put(key, value)
    }

    return JsonOutput.toJson(approved)

}

//println(parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}"))

return this