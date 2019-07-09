def checkOctet(str) {
    return str ==~ /^([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])$/
}

def isIp(str){
    octets = str.split("\\.")
    if(octets.size() != 4)
        return false
    return checkOctet(octets[0]) && checkOctet(octets[1]) && checkOctet(octets[2]) && checkOctet(octets[3])

}

//print isIp("10.0.152.164")
//print isIp("-1.0.0.0")
//print isIp("0.0.257.0")
//print isIp("10.0.0.0.10")
//print isIp("0.0.256.0")
//print isIp(256)
return this
