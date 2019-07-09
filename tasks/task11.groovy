something = "1() 2() 3()"

def gstring(String string, int num) {
    done =''
   for (count in 1..3) {
       w = ''
       if (count == num) {
           w = string
           done += "${count}(${w}) "
       }
   }
    return done
}
return this
