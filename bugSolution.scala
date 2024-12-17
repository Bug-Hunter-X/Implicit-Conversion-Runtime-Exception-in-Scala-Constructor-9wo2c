```scala
class MyClass[T](val value: T) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println(s"Error converting '$s' to Int: ${e.getMessage}")
        this(null.asInstanceOf[T]) // Or handle appropriately
    }
  }
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("20")
val instance3 = new MyClass("abc") // Now handles this gracefully
```