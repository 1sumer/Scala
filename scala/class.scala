def main(args: Array[String]): Unit = {
class Person(name: String, age: Int) {
  def displayInfo(): Unit = {
    println(s"Name: $name, Age: $age")
  }
}

val person1 = new Person("Alice", 30)
val person2 = new Person("Bob", 25)

person1.displayInfo()  
person2.displayInfo()
}