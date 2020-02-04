trait Queue {
  def opEnqueue(list: List[Int], num: Int): List[Int]

  def opDequeue(list: List[Int]): List[Int] = list.tail

}

class DoubleList extends Queue { //extending the trait
  override def opEnqueue(list: List[Int], num: Int): List[Int] = {
    val result = num * 2
    list :+ result
  }

}

class SquareList extends Queue {
  override def opEnqueue(list: List[Int], num: Int): List[Int] = {
    val result = num * num
    list :+ result
  }

}


object ImplementQueue extends App {
  val double = new DoubleList
  val square = new SquareList
  val dequeue = new DoubleList
  println(double.opEnqueue(List(1, 2, 3, 4, 5), 6))
  println(square.opEnqueue(List(1, 2, 3, 4, 5), 6))
  println(dequeue.opDequeue(List(1, 2, 3, 4, 5, 6)))
}