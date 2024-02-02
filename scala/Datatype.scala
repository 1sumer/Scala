def main(args: Array[String]) :Unit =
{
    var a: Boolean = true
    var a1: Byte = 126
    var a2: Float = 2.45673f
    var a3: Int = 3
    var a4: Short = 45
    var a5: Double = 2.93846523
    var a6: Char = 'A'
    var a7: List[Int] = List(1,2,3,4)
    var a8: Vector[String] = Vector("Sameer", "Pasha")
    var a9: List[Any] = List(1,"Sameer",2,"Pasha")
    if (a == true) 
    {
    println("boolean:geeksforgeeks")
    }
    println("byte:" + a1)
    println("float:" + a2)
    println("integer:" + a3)
    println("short:" + a4)
    println("double:" + a5)
    println("char:" + a6)
    println(a7)
    println(a8)
    println(a9)
}
