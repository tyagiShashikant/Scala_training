package Stack
  class MyStack [A]{
   var stack = List.empty[A]

   def peek() = stack.head

   def push(x: A) = stack = x :: stack

   def pop() = {
     val popped = stack.head
     stack = stack.tail
     popped
   }

   def print= stack.foreach(println)
 }
object main extends App{
  val stack1= new MyStack[Int]
  stack1.push(10)
  stack1.push(2)
  stack1.push(40)
  stack1.print
  stack1.pop()
  stack1.print


}