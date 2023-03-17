import org.scalatest.funsuite.AnyFunSuite

class FunctionExpandTestCase extends AnyFunSuite {
  test("add should return the sum of two numbers") {
    assert(FunctionExpand.add(100, 111) == 211)
    assert(FunctionExpand.add(-50, 17) == -33)
    assert(FunctionExpand.add(0, 0) == 0)
  }

  test("sumOfList should return the sum of all elements in a list of integers") {
    assert(FunctionExpand.sumOfList(List(14, 15, 16)) == 45)
    assert(FunctionExpand.sumOfList(List(-2, 10, 2)) == 10)
    assert(FunctionExpand.sumOfList(List()) == 0)
  }

  test("higherOrderFunction should apply the given function to the given integer") {
    assert(FunctionExpand.higherOrderFunction((num: Int) => num + num, 10) == 20)
    assert(FunctionExpand.higherOrderFunction((num: Int) => num * 2, 5) == 10)
    assert(FunctionExpand.higherOrderFunction((num: Int) => num / 2, 8) == 4)
  }
}