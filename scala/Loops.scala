object Loops {
  def main(args: Array[String]): Unit = {
    // Using while loop
    var i = 0
    while (i < 5) {
      println(i)
      i += 1
    }

    // Using for loop
    for (j <- 0 until 5) {
      println(j)
    }
  }
}
