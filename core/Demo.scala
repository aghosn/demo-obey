object Demo {
  implicit val i = 3
  implicit def foo = "Hello"
  def badUnit { 
    val hw = "Hello World!"
  }
  def bar(arg: String) {
    var s = "Hello "+arg
  } 
  var legal = "No problem here"
  implicit def dummy {
    var c = "I should be a val"
  }
  
}