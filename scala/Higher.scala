def main(args: Array[String]): Unit = {
    val range: Range= 1 until 5
    val a = range.map(a => a+1)
    val b = range.map(_+1)

    val list: List[String] = List("Scala","Python","R", "SQL")
    val c = list.map(a=>a + "#")
    val d = list.flatMap(a=>a+"#")
    val e = list.filter(a=> a.contains("S"))

    val f = range.foreach(println)

    val g = list.forall(a=>a.contains("S"))

    val h = range.reduce(_+_)

    val i = range.foldLeft(0){case (acc, cur) => acc+cur}

    val j = range.product

    val k = range.exists(a =>a == 3)

    val l = range.find(a =>a == 6)

    val m = range.takeWhile(a =>a == 3)

    val n = range.dropWhile(a =>a == 3)


    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
    println(k)
    println(l)
    println(m)
    println(n)
    println(e)
}
