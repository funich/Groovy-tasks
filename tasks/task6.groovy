import groovy.json.JsonSlurper

def adults(def str) {
	if (str instanceof String) str = new JsonSlurper().parseText(str)
    str.removeAll {
        it.value < 18
   	}
    return str
}

return this