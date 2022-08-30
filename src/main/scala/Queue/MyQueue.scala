package Queue


object Queue extends  App{

  def enqueue(inputList: List[Int], value: Int): List[Int] =  inputList :+ value

  def dequeue(inputList: List[Int]): List[Int] = {
    inputList match {

      case Nil => throw new NoSuchElementException()

      case h :: tail => tail
    //  case _=> inputList.tail
    }
  }
  val lst= List(1,2,3,4,5,6)
  println(dequeue(lst))
}
