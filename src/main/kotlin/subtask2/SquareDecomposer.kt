package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        var temp=number*number
        var sq=0
        val resultList = mutableListOf<Int>()
        var element = number-1
        do {
            resultList.add(element)
            temp -=element*element
            if(temp==0)
                return resultList.reversed().toTypedArray()
            if(element==1)
            {
                if (resultList.size < 2)
                {
                    break
                }
                temp += resultList.last() * resultList.last()
                resultList.removeAt(resultList.lastIndex)
                element = resultList.last() - 1
                temp += resultList.last() * resultList.last()
                resultList.removeAt(resultList.lastIndex)
            }
            else
            {
                sq = kotlin.math.sqrt(temp.toFloat()).toInt()
                if(element<=sq) {
                    element--
                }
                else {
                    element = sq
                }
            }
        }
        while (element>0)

        return null
    }
}
