import java.util.*

class Square (_name: String) : Shape(_name), Dimensionable{

    private var length: Double = 0.0
    private var width: Double = 0.0

    fun setDimensions() {
        val reader = Scanner(System.`in`)
        print("Enter length: ")
        length = reader.nextDouble()

        print("Enter width: ")
        width = reader.nextDouble()
    }

    override fun getArea(): Double {
        return length * width
    }

    override fun printDimensions() {
        println("Length: $length")
        println("Width: $width")
    }
}