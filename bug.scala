```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft, attempting to add an Int to a String
  val result = list.foldLeft("")(_ + _)
  println(result) // This will cause a type mismatch error
}
```