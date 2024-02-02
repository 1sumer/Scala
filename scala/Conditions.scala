import scala.util.control.Breaks._

def main(args: Array[String]): Unit = {
  breakable {
    for (i <- 0 until 5) {
      if (i == 3) {
        // Break out of the loop when i == 2
        break
      } else {
        println(i)
      }
    }
  }
}
