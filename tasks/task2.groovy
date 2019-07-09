def mulEvenOdd(array) {
    for (int i = 0; i < array.size(); i++) {
       if (array[i] % 2 == 0) {
           array[i] *= 2
       } else {
           array[i] *= 3
       }
    }

    return array
}

return this
