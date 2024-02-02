import scala.util.{Try, Success, Failure}
import java.io.{FileReader, FileNotFoundException, IOException}

object excep {
  def main(args: Array[String]): Unit = {
    def toInt(s: String): Int =
      try {
        s.toInt
      } catch {
        case _: NumberFormatException => 0
      }

    val a = Try(toInt("100"))
    val b = Try(toInt("Martin"))
    println(a)
    println(b)

    def makeInt(s: String): Int =
      Try {
        s.toInt
      } match {
        case Success(n) => n
        case Failure(_) => 0
      }

    val result1 = makeInt("35")
    val result2 = makeInt("james")
    println(result1)
    println(result2)

    try {
      val input = new FileReader("myinput.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("File not found")
      }
      case ex: IOException => {
        println("Exception in I/O")
      }
    } finally {
      println("Exiting the code...")
    }
  }
}
