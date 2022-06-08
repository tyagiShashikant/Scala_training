package PredefindMethods
import scala.collection.immutable._

object MainObject extends App{

    val ll = List(1,81,25,36,90,58,23,15,4)
    println(ll)

   println(ll.head)
   println(ll.tail)

   val ll2 = List(2,3)
   val ll3 =ll :: ll2
   println(ll3)

   println(ll3.isEmpty)

  println(ll3.reverse)
  println(ll.max)
  println(1::2::3::4::Nil)

  var sum=0
  ll.foreach(sum += _)
}