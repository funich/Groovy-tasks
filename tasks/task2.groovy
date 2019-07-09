def mulEvenOdd(List inlist) {

  def outlist = []
  inlist.each {
    def item = it.toInteger()
    (item%2 == 0) ? (item *= 2) : (item *= 3)
    outlist.add(item)
  }
  return outlist
}
//print (mulEvenOdd([4,5,6]))
return this
