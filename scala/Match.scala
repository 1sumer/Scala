case class Customer(fn: String = "", ln: String = "")

object Main {
def main(args: Array[String]): Unit = {

  def isCustomer(someValue: Any): Boolean = {
    someValue match {
      case cust: Customer => true
      case _ => false
    }
  }

  val a = Customer("Martine", "Odersky")

  val b = isCustomer(a)

  val c = isCustomer("Martin Odersky")

  println(b)
  println(c)
}
}