import java.util.*
import kotlin.math.*

open class Triangle (_name: String) : Shape(_name), Dimensionable {

    private var length1: Double = 0.0
    private var length2: Double = 0.0
    private var length3: Double = 0.0

    open fun setDimensions() {
        val reader = Scanner(System.`in`)
        print("Enter length 1: ")
        length1 = reader.nextDouble()

        print("Enter length 2: ")
        length2 = reader.nextDouble()

        print("Enter length 3: ")
        length3 = reader.nextDouble()
    }

    override fun getArea(): Double {
        val perimeter = length1 + length2 + length3
        val s = 0.5 * perimeter
        val a = s - length1
        val b = s - length2
        val c = s - length3

        if (a > 0 && b > 0 && c > 0)
            return sqrt((0.5 * a * b * c))
        else
            return 0.0
    }

    open override fun printDimensions() {
        println("Length 1: $length1")
        println("Length 2: $length2")
        println("Length 3: $length3")
    }
}