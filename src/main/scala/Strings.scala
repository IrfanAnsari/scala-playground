import scala.annotation.tailrec

object Strings {
  def reverse(s: String) = {
    s.foldLeft("")((x, y) => y + x)
  }


  def reverseIter(s: String) = {
    var reversedString: String = ""
    for (c <- s) {
      reversedString = c + reversedString
    }
    reversedString
  }


  def reverseRecursion(s: String): String = {

    if (s.length == 1) s
    else
      s.charAt(s.length - 1) + reverseRecursion(s.substring(0, s.length - 1))
  }


  def reverseUsingHeadAndTail(s: String): String = {

    if (s == null) return s
    if (s.tail.isEmpty) return s

    reverseUsingHeadAndTail(s.tail) + s.head

  }


  def reverseWithTelRec(s: String): String = {

    @tailrec
    def impl(ss: String, resultAccumulator: String): String = {

      if (ss == null) return null

      if (ss.tail.isEmpty) return ss.head + resultAccumulator

      impl(ss.tail, ss.head + resultAccumulator)
    }

    impl(s, "")


  }


}
