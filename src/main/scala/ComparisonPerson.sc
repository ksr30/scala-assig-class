
class Person(val name:String,val age:Int) extends Ordered[Person]{
  def compare(that:Person)={
    val resName=this.name.compareTo(that.name)
    if (resName == 0) {
      val resAge = this.age - that.age
      if (resAge > 0) {
        1
      }
      else {0}
    }
    else {
      val resLength=this.name.length()-that.name.length()
      if (resLength>0){
        1
      }
      else {
        0
      }




    }
  }
}
object Person{
  def main(args:Array[String]): Unit ={
    println("Enter details of first person")
    println("Enter first name")
    val firstName1=scala.io.StdIn.readLine()
    println("Enter Age")
    val age1=scala.io.StdIn.readInt()
    println("Enter details of second person")
    println("Enter first name")
    val firstName2=scala.io.StdIn.readLine()
    println("Age")
    val age2=scala.io.StdIn.readInt()
    val personA=new Person(firstName1,age1)
    val personB=new Person(firstName2,age2)

    if (personA > personB){
      println("PersonA > PersonB")
    }
    else {
      println("personB < personA")
    }
  }

}

