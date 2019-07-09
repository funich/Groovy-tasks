def mulEvenOdd(array) {
  for (i = 0; i < array.size(); i++) {
     if (array[i] % 2 == 0) {
         array[i] *= 2
     } else {
         array[i] *= 3
     }
  }
  return array
}

a = mulEvenOdd([4, 5, 6])
println(a)

return this
