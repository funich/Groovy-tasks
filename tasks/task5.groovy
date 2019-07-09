def part = /(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\./
exp = part*3 + part[0..-3]


def isIp(String str){

    return str ==~ exp
}

//println(isIp('192.168.110.5'))

return this