fun main(args: Array<String>) {
    val circle = Circle("Circle")

    println("Shape: ${circle.name}")
    circle.setDimensions()
    circle.printDimensions()
    println("Area: ${circle.getArea()}\n")

    val square = Square("Square")

    println("Shape: ${square.name}")
    square.setDimensions()
    square.printDimensions()
    println("Area: ${square.getArea()}\n")

    val triangle = Triangle("Triangle")

    println("Shape: ${triangle.name}")
    triangle.setDimensions()
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}\n")

}