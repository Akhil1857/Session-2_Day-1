
case class SquareList(userInputList: List[Int]) {

  // Squared the List items using Map
  def squareUsingMap(): List[Int] = userInputList.map(value => value * value)

  // Squared the List item using pattern matching
  def squareUsingMatch(numberList: List[Int]): List[Int] =
    numberList match {
      case Nil => Nil
      case head :: tail => head * head :: squareUsingMatch(tail)
    }


}
