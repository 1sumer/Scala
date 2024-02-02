object data {
def main(args: Array[String]): Unit = {
    val a: List[Int] = List(1,2,3,4,5)
    val b = 0 :: a // Prepending
    val c = b ::: List(6,7,8) // Appending
    val d = -1 +:c // Prepending
    val e = d :+ 9 // Appending
    val f = e ++ List(10,11,12) // Concatinating
    val lenght = f.length
    val filter = f.filter(f => f%2==0)
    val sort = f.sorted
    val no = f.contains(3)
    val index = f.indexOf(6)
    val group = f.groupBy(f => f%2==0)
    val conv1 = f.toSet

    println(a)
    println(lenght)
    println(filter)
    println(sort)
    println(no)
    println(index)
    println(group)
    println(f)
    println(conv1)

}
    val aa: Set[Int] = Set(1,2,3,4,5)
    val ab = aa+6 // Adding
    val ac = ab-1 // Appending
    val af = ac ++ Set(7,8,9) // Concatinating
    val inter = af.intersect(Set(3,4,5))
    val dif = af.diff(Set(3,4,5))
    val lenght = af.size
    val filter = af.filter(af => af%2==0)
    val no = af.contains(3)
    val index = af.subsetOf(Set(1,2,3,4,5,6))
    val group = af.groupBy(af => af%2==0)
    val conv = af.toList

    println(aa)
    println(inter)
    println(dif)
    println(lenght)
    println(filter)
    println(no)
    println(index)
    println(group)
    println(af)

    
    println(conv)
}