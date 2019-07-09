def isSublist(def list, def sublist) {
    def ind, ind1
    for (def it : sublist) {
        if (ind == null) {
            ind = list.indexOf(it)
        }
        else {
            ind1 = list.indexOf(it)
            if (ind != ind1 - 1 || ind != -1)
                return false
            ind = ind1
        }
    }
    return true
}

return this
