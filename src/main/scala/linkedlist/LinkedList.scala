package linkedlist

import scala.collection.View.Empty


class EmptyList[A] extends MyList[A]{

  def head:A = throw new NoSuchElementException
  def tail:MyList[A] = throw new NoSuchElementException
  def isEmpty:Boolean = true
  def add(x:A):MyList[A] = new ImmutableList(x,EmptyList.this)
  def printElements: String = ""
}

class ImmutableList[A](h:A, t:MyList[A]=null) extends MyList[A]{

  def head:A = h
  def tail:MyList[A] = t
  def isEmpty:Boolean = false
  def add(x:A):MyList[A] = new ImmutableList(x,this)
  def printElements: String = {
    if (t.isEmpty) ""+h
    else h +" "+t.printElements
  }


}

object ImmutableListTest extends App{
  val empty = new EmptyList[Int]
  val ll = new ImmutableList(1,new ImmutableList(2,new ImmutableList(3,empty)))
  println(ll.head)
  println(ll.tail.head)
  println(ll.toString)
  val ll2=ll.add(4)
  println(ll2)
  val ll3= ll2.add(23)
  println(ll3)
}