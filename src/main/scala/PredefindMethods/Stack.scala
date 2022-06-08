package PredefindMethods

import scala.collection.mutable

object Stack extends App{
    val st=mutable.Stack(2,3,4,5,6)
    println(st.pop())
  println(st.push(5))
  println(st.push(88))

}
