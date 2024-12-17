```scala
class MyClass[T](val value: T) {
  def this(s: String) = this(s.toInt) // Implicit conversion from String to Int
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("20")
// this will cause issue if input string cannot be converted to integer
val instance3 = new MyClass("abc")
```