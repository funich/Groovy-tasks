def adults(people) {
    map_of_adults = [:]
    people.each { name, age ->
        if (age >= 18) {
            map_of_adults.put(name, age)
        }
    }

    return map_of_adults
}

return this
