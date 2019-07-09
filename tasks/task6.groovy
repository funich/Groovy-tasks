import groovy.json.JsonSlurper

def adults(def str) {
	if (str instanceof String) str = new JsonSlurper().parseText(str)
    return str.findAll {
        it.value >= 18
   	}
}

return this