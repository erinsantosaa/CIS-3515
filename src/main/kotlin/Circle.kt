import java.util.*

class Circle (_name: String) : Shape(_name), Dimensionable {
    private var radius = 0.0

    fun setDimensions() {
        val reader = Scanner(System.`in`)
        print("Enter a radius: ")
        radius = reader.nextDouble()
    }

    override fun getArea(): Double {
        return 3.14 * radius * radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }
}