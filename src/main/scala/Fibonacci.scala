object Fibonacci {

  def at(i: Int) : Int=  i match {
    case 0 => 0
    case 1 => 1
    case _ => at(i-2) + at(i-1)

  }


}
