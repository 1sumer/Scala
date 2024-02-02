@main def hello(): Unit = 
  val a: Range = 1 to 10
  println(a.toList)
  println(msg)

def msg = "I was compiled by Scala 3. :)"
