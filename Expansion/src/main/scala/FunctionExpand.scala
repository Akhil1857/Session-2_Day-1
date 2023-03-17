object FunctionExpand {

  //  val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  //  Expanded Version of Above Function :-
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }

  //  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  //  Expanded Version of Above Function :-
  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }

  //  val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num: Int) => f(num)
  //  Expanded Version of Above Function :-
  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    override def apply(f: Int => Int, num: Int): Int = f(num)
  }

}
