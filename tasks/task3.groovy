def isSublist(def list, def sublist) {
    def res = list.intersect(sublist)
    if (res == sublist)
        return true
    else
        return false
}

return this
