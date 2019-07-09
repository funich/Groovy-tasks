def adults(humans) {
   def map = [:]
    humans.each { name, years ->
        if (years >= 18) {
            map.put(name, years)
        }
    }
    return map
}
return this
