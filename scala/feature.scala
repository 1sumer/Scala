import scala.util.{Try, Success, Failure}

object fet {
    def main(args: Array[String]): Unit = {
        def makeInt(s:String): Int = Try(s.toInt)
            match {
                case Success(n) => n
                case Failure(_) => 0
            }
        val a = makeInt("35")
        val b = makeInt("sameer") 
        println(a) 
        println(b)  
    }
}