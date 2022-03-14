import java.util.*
import kotlin.math.roundToInt

fun evenIndexAverage(array: IntArray): Int {


    var sum = 0
    var num = 0.0
    for(i in 0 until array.size ){

        if (i % 2 == 0){
            sum += array[i]
            num += 1
        }

    }
    var avg = sum / num


    return avg.roundToInt()

}

fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun main() {

    var array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8,31)

    println(evenIndexAverage(array))

    val sc = Scanner(System.`in`)
    println("Enter String : ")

    val inString: String = sc.nextLine()

    println(isPalindromeString(inString))


}