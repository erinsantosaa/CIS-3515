fun main(args: Array<String>) {
    val circle = Circle("Circle")

    println("Shape: ${circle.name}")
    circle.setDimensions()
    circle.printDimensions()
    println("Area: ${circle.getArea()}\n")

}