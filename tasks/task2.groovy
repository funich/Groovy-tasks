// task2.groovy - function [] mulEvenOdd([]), return a list of input elements,
// where odd numbers are multiplied by 3 and even numbers by 2.
// Example - mulEvenOdd([4,5,6]) == [8,15,12]


def mulEvenOdd(x)
{
  def y=[]
  x.each { z -> y+=z*=z%2?3:2 }
  return y
}

return this
