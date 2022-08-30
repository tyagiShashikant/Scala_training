package MultiThreading

object multi {
  def demo(): Unit ={
    var x = 0
    val thread=(1 to 2000).map(_ =>new Thread(() =>
      synchronized{
        x+=1
        println("Thread"+x)
      }
    ))
    thread.foreach(_.start)
    thread.foreach(_.join())
  }
  def main(args: Array[String]): Unit = {
    demo()
  }

}
