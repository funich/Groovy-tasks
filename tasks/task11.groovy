something = "1() 2() 3()"
def gstring(String str, int num) {
    done =""
   for (int count in 1..3) {
       w = ''
       if (count == num) {
           w = str
       }
       done += "${count}(${w}) "
   }
    return done
}
return this
