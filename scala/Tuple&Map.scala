object map {
def main(args: Array[String]): Unit = {
    val tuple = (1, "a", 2, "b")
    val res1: (Int, String) = (1, "a")   // Corrected declaration
    val res2: (Int, String) = (2 -> "b") // Corrected declaration
    val res3: ((Int, String),Int) = ((3 -> "a") , 4) // Corrected declaration

    val (first,second, third, fourth) = tuple

    println(tuple)
    println(res1)
    println(res2)
    println(res3)
    println(first)
}
    val map: Map[Int, String] = Map(1->"a", 2->"b", 3->"c")

    val res4 = map(1)
    val res5 = map.get(3)
    val res6 = map.getOrElse(1,"z")

    println(res4)
}