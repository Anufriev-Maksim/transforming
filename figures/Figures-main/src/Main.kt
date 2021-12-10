fun main() {

    val f = Rect(0,3,1,2)

    println("Rotation Rect(" + f.c_pos() + ")")
    f.rotate(RotateDirection.Clockwise,0,1)
    println(f.c_pos())

    println(f.area())
    f.resize(2)
    println(f.area())

    val f1 = Square(7,7,2)

    println("Rotation Square(" + f1.c_pos() + ")")
    f1.rotate(RotateDirection.CounterClockwise,7,4)
    println(f1.c_pos())

    println(f1.area())
    f1.resize(2)
    println(f1.area())

    val f2 = Circle(2,2,3)

    println("Rotation Circle(" + f2.c_pos() + ")")
    f2.rotate(RotateDirection.Clockwise,0,0)
    println(f2.c_pos())

    println(f2.area())
    f2.resize(2)
    println(f2.area())


}