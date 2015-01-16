object Demo {
  implicit val i = 3
  implicit def foo = "Hello"
  val l = List(1, 2, 3, 4).toSet
  def badUnit { 
    println("Hello World!")
  }
  def bar(arg: String) {
    println("Hello "+arg)
  } 
  var legal = "shouldn't be modified"
  implicit def dummy = {
    var c = "should be a val"
  }
  
}