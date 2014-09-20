def countChange(money: Int, coins: List[Int]): Int = {
  if (coins.isEmpty) {
    0
  } else {
    if (money - coins.head > 0) {
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    } else if (money - coins.head == 0) {
      1 + countChange(money, coins.tail)
    } else {
      countChange(money, coins.tail)
    }
  }
}

println(countChange(200, List(200, 100, 50, 20, 10, 5, 2, 1)))
