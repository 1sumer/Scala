// Function that adds two integers
def add(x: Int, y: Int): Int = {
  x + y
}

// Function that greets a person
def greet(name: String): String = {
  s"Hello, $name!"
}

// Function without parameters
def printMessage(): Unit = {
  println("This is a message.")
}

// Function with default parameter value
def multiply(x: Int, y: Int = 2): Int = {
  x * y
}

// Main function to demonstrate calling other functions
def main(args: Array[String]): Unit = {
  // Calling the add function
  val sum = add(5, 3)
  println(s"Sum: $sum")

  // Calling the greet function
  val greeting = greet("Alice")
  println(greeting)

  // Calling the printMessage function
  printMessage()

  // Calling the multiply function with and without specifying the second parameter
  val result1 = multiply(4, 3)
  val result2 = multiply(4)  // Default value of y is used (2)
  println(s"Result 1: $result1, Result 2: $result2")
}
