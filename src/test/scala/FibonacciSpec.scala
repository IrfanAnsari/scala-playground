import org.scalatest.FlatSpec


class FibonacciSpec extends FlatSpec {

  it should " print 1st number in the series as  0"  in {
    assert(Fibonacci.at(0) == 0)
  }

  it should " print 2nd number in the series as  1"  in {
    assert(Fibonacci.at(1) == 1)
  }

  it should " print 3rd number in the series as  1"  in {
    assert(Fibonacci.at(2) == 1)
  }

  it should " print 4th number in the series as  2"  in {
    assert(Fibonacci.at(3) == 2)
  }

  it should " print 4th number in the series as  3"  in {
    assert(Fibonacci.at(4) == 3)
  }


  it should " print 5th number in the series as  5"  in {
    assert(Fibonacci.atTailRec(5) == 5)
  }

  it should " print 6th number in the series as  8"  in {
    assert(Fibonacci.atTailRec(6) == 8)
  }

}
