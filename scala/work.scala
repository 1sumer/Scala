def main(args: Array[String]): Unit = {
    case class Customer(fn: String = "",
    ln: String = "")

    @volatile var customer = Customer("Martine", "Odersky")

    customer = customer.copy(ln = "Doe")

    println(customer)
}