println "Your enter (ex: 1,2,3) "
def value1 = System.in.newReader().readLine() //as List
value = value1.split(",") //as Integer
println ("Your value like list: " + value + "\n")
println "Your result is: "
mulEvenOdd(value*.toInteger())

def mulEvenOdd(value){
    for(int i = 0; i < value.size(); i++) {
        if (value[i] % 2 == 0) {
            value[i] *= 2
        }
        else value[i] *= 3
    }
    print(value)
}
