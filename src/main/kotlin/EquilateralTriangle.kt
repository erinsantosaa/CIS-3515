import java.util.*
import kotlin.math.*

class EquilateralTriangle (_name: String) : Triangle(_name){
    private var length: Double = 0.0

    override fun setDimensions(){
        val reader = Scanner(System.`in`)
        print("Enter a length: ")
        length = reader.nextDouble()
    }

    override fun getArea(): Double {
        val perimeter = length * 3
        val s = 0.5 * perimeter
        val a = s - length
        val b = s - length
        val c = s - length

        if (a > 0 && b > 0 && c > 0)
            return sqrt((0.5 * a * b * c))
        else
            return 0.0
    }

    override fun printDimensions() {
        println("Length: $length")
    }
}