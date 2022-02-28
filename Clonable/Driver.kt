fun main(){
  val c : Circle = Circle(5.0)
  c.area()
  val d = c.clone()
  d.area() 
  
             //changing params of cloned object
  d.r = 6.0  //      |
  d.area()   //      |
  c.area()   //creates no affect on initial objects
}
