// task3.groovy - function boolean isSublist([], []), define, 
// whether second list sublist of the first list.
// Example - isSublist([1,2,3], [2,3]) == true

def isSublist(x, y)
{
  return x.containsAll(y)
}
return this
