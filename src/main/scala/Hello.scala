/**
  * The static object (singleton) that is going to be used
  * to start the application.
  */
object Hello extends App {

  /**
    * The main function to be called for the starting
    * of the application.
    *
    * @param args The arguments for the startup.
    */
  override def main(args: Array[String]): Unit = {
    oldStyle
    newStyle
  }

  def oldStyle(): Unit = {
    println("hello world")
    val buffer = new StringBuffer()
    buffer.append("Hello World (Buffer)")
    println(buffer.toString())
    println(hello())
  }

  def newStyle(): Unit = {
    println("hello world")
    val buffer = new StringBuffer()
    buffer.append("Hello World (Buffer)")
    println(buffer toString)
    println(hello)
  }

  def hello(): String = {
    "Hello World (Function)"
  }

  def sum(first: Int, second: Int): Int = {
    first + second
  }
}
