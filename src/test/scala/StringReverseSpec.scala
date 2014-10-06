import org.scalatest.FlatSpec

class StringReverseSpec extends FlatSpec {

  it  should "reverse a one letter string" in {
    assert(Strings.reverse("a") == "a")
  }


  it  should "reverse a two letter string using iteration" in {
    assert(Strings.reverseIter("ab") == "ba")
  }


 it  should "reverse a two letter string using recursion" in {
    assert(Strings.reverseRecursion("ab") == "ba")
  }

  it  should "reverse a two letter string using recursion with tail and head" in {
    assert(Strings.reverseUsingHeadAndTail("ab") == "ba")
  }

  it  should "reverse a two letter string using tail rec" in {
    assert(Strings.reverseWithTelRec("ab") == "ba")
  }

}
