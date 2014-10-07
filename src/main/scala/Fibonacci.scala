import scala.annotation.tailrec

object Fibonacci {

  def at(i: Int): Int = i match {
    case 0 => 0
    case 1 => 1
    case _ => at(i - 2) + at(i - 1)

  }


  def atTailRec(n: Int): Int = {
    @tailrec
    def impl(a: Int, b: Int, n: Int): Int = {
      if (n > 0)  {
        impl(b, a + b, n - 1)
      }
      else a
    }
    impl(0, 1, n)
  }


}
