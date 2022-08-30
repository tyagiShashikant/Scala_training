package tree

class BinaryTree
case object EmptyTree extends BinaryTree
case class Node(elem: Int, left: BinaryTree, right: BinaryTree) extends BinaryTree

class OperationsBinaryTree {
  def contains(t: BinaryTree, v: Int): Boolean = t match {
    case Node(elem, left, right) if (elem == v) => true
    case Node(elem, left, right) => if (elem > v) contains(left, v) else contains(right, v)
    case _ => false
  }
  def insert(t: BinaryTree, v: Int): BinaryTree = t match {
    case Node(elem, left, right) if (elem > v) => Node(elem, insert(left, v), right)
    case Node(elem, left, right) if (elem < v) => Node(elem, left, insert(right, v))
    case EmptyTree =>  Node(v, EmptyTree, EmptyTree)
    case _ => t
  }

}
object  main extends App{
  val obj=new OperationsBinaryTree
  var temp =obj.insert(EmptyTree,10)
  temp=obj.insert(temp,5)
  temp=obj.insert(temp,20)
  temp=obj.insert(temp,1)
  temp=obj.insert(temp,8)
  println(temp
  )
println(obj.contains(temp,1))


}
