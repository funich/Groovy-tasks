import groovy.json.JsonSlurper

def adults(def str) {
    def map = new JsonSlurper().parseText(str)
    map.removeAll {
        it.value < 18
    }
    return map
}

return this