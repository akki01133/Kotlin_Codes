
interface Clonable{
    fun clone(): Shape
}

abstract class Shape{
    abstract fun area() : Double
}

open class Circle(val r: Double): Shape(),Clonable{
    override fun area() = Math.PI * r * r
  /**
   * -implementation of clone() function in Circle class
   * -circle objects can be clones using clone() method 
   * -new clone object and the object that is cloned are independent
   *  of each other
   */
  override fun clone(): Circle {
        return object : Circle(4.0){
            override fun area()= super.area()
            override fun clone(): Circle{
                return super.clone()
            }
        }
    }
}