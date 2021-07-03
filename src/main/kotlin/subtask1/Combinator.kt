package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        fun factorial(n : Int) : Int {
            var factorial = 1
            for (i in 1..n) {
                factorial *= i
            }
            return factorial
        }
        for(n in 1..array[1]){
            if(array[0]*factorial(n)*factorial((array[1]-n)) == factorial(array[1])) {
                return n
            }
            else {
                continue
            }
        }
        return null
    }
}
