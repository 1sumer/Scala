object Main {
  def main(args: Array[String]): Unit = {
    var a: Float = 454.32138988f
    var b: Double = a.toDouble // Explicit conversion

    printf("a = " + a + "\t b = " + b)
  }

  for (i <- 0 to 3) {
      for (j <- 0 until 2) {
        if (i + j == 3) {
          print((i * j) + "\t")
        }
      }
    }
}