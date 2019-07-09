// task6.groovy - function [:] adults(string),
// find all adults in the input map and return them as map.
// Example - adults([Kate: 24, Alan:16, Osvald: 18]) == [Kate: 24, Osvald: 18]

def adults(String s)
{
  def k = evaluate(s)
  return k.findAll {it.value >= 18}
}
return this
