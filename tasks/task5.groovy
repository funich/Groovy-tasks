// task5.groovy - function boolean isIp(string),
// define, whether input string have a Ip format.
// Example - isSublist(10.0.152.164) == true

def isSublist(String s)
{
  def IP_Range = 0..255
  def numbers=s.split('\\.')
  def k=[]
  numbers.each { z -> k+=z.toInteger() }
  return IP_Range.containsAll(k)?k.size()==4:false
}
return this
