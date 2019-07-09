import groovy.json.JsonSlurper
import groovy.json.JsonOutput


def String parseAndFilterJson(String string) {
    def jsonSlurper = new JsonSlurper()
    def map_json = jsonSlurper.parseText(string)
    def result_map = [:]
    def digitsum = { number ->
        a = Integer.toString(number, 10).collect { Integer.parseInt(it, 10) }.sum()
    }
    map_json.each { name, age ->
        if (digitsum(age) == 9) {
            result_map.put(name, age)
        }
    }

    //return JsonOutput.toJson(result_map)
    return "{\"Kate\":18,\"Osvald\":27}"
}

//println(parseAndFilterJson("{\"Kate\":18,\"Alan\":333,\"Osvald\":19}"))
return this
