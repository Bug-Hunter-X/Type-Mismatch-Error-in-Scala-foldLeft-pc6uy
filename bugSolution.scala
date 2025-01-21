```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct use of foldLeft, converting Int to String before concatenation
  val result = list.foldLeft("")((acc, i) => acc + i.toString)
  println(result) // Output: 12345

  //Alternative solution using map and mkString
  val result2 = list.map(_.toString).mkString
  println(result2) // Output: 12345
}
```