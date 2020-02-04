class FirstName(val firstName: String) extends AnyVal{

  def enterFirst= firstName

}

class LastName(val lastName: String) extends AnyVal{

  def enterLast= lastName

}

class Age(val age: Int) extends AnyVal{

  def enterAge= age

}


object GetDetail{
  1
  def main(args: Array[String]): Unit = {
    println("Enter First Name")
    val first=scala.io.StdIn.readLine()
    println("Enter Last Name")
    val last=scala.io.StdIn.readLine()
    println("Enter Age")
    val a=scala.io.StdIn.readInt()
    val firstName = new FirstName(first)
    val lastName = new LastName(last)
    val age = new Age(a)

    displayDetails(firstName, lastName, age)


    def displayDetails(firstName: FirstName, lastName: LastName, age: Age): Unit = {

      val first = firstName.enterFirst
      val last = lastName.enterLast
      val a = age.enterAge
      print(s"$first $last is of $a years")
    }
  }

}