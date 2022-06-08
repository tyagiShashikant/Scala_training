package Queue


class Queue {

  def enqueue(inputList: List[Int], value: Int): List[Int] =  inputList :+ value

  def dequeue(inputList: List[Int]): List[Int] = {
    inputList match {

      case Nil => throw new NoSuchElementException()

      case h :: tail => tail

    }
  }
}
  object main extends App{
    val queue1= new Queue
    val list= List(1,2,3,4,5)
    println(list)
   val list2 =queue1.enqueue(list,9)
    println(list2)
   val list3= queue1.dequeue(list2)
    println(list3)


  }
