object InputOutputExample {
  def main(args: Array[String]): Unit = {
    // Reading input from the console
    print("Enter your name: ")
    val name = scala.io.StdIn.readLine()

    // Reading an integer from the console
    print("Enter your age: ")
    val age = scala.io.StdIn.readInt()

    // Performing some computation
    val nextYearAge = age + 1

    // Printing output
    println(s"Hello, $name!")
    println(s"Next year, you will be $nextYearAge years old.")
  }
}
