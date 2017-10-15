import org.scalatest.FunSuite

class SetSuite extends FunSuite {

  test("The sum of values should be 5") {
    assert(Hello.sum(2, 3) == 5)
  }

  test("The sum of values should not be 0") {
    assert(Hello.sum(2, 3) != 0)
  }
}