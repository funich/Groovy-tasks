def urlText(url){
    return new URL(url).getText()
}
print(urlText("http://httpstat.us/200"))