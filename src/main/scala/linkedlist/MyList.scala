package linkedlist

trait MyList[A] {
  def head:A
  def tail:MyList[A]
  def isEmpty:Boolean
  def add(x:A):MyList[A]
  def printElements:String
  override def toString:String = "[ "+printElements+" ]"
}