import org.scalatest.funsuite.AnyFunSuite

class SquareListTestCase extends AnyFunSuite {

  test("1-SquareList(userList).squareUsingMap() it will return square of all element in the userList") {
    val userList = List(1, 2, 3, 4)
    val expectedList = List(1, 4, 9, 16)
    val squaredList = SquareList(userList).squareUsingMap()
    assert(squaredList == expectedList)
  }

  test("2-SquareList(userList).squareUsingMap() it will return square of all element in the userList") {
    val userList = List(-1, -2, -3, -4)
    val expectedList = List(1, 4, 9, 16)
    val squaredList = SquareList(userList).squareUsingMap()
    assert(squaredList == expectedList)
  }

  test("3-SquareList(userList).squareUsingMatch() it will return square of all element in the userList") {
    val userList = List(5, 6, 7, 8)
    val expectedList = List(25, 36, 49, 64)
    val squaredList = SquareList(userList).squareUsingMatch(userList)
    assert(squaredList == expectedList)
  }

  test("4-SquareList(userList).squareUsingMatch() it will return square of all element in the userList") {
    val userList = List(-3, -4, -8, -9)
    val expectedList = List(9, 16, 64, 81)
    val squaredList = SquareList(userList).squareUsingMatch(userList)
    assert(squaredList == expectedList)
  }

  test("5-SquareList(userList).squareUsingMap() it will return square of all element in the userList") {
    val userList = List.empty[Int]
    val expectedList = List.empty[Int]
    val squaredList = SquareList(userList).squareUsingMap()
    assert(squaredList == expectedList)
  }

  test("6-SquareList(userList).squareUsingMatch() it will return square of all element in the userList") {
    val userList = List.empty[Int]
    val expectedList = List.empty[Int]
    val squaredList = SquareList(userList).squareUsingMatch(userList)
    assert(squaredList == expectedList)
  }


}