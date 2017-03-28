def allMultiplesSum(entry: Int): Int = {
  (1 to ((entry - 1) / 3)).sum * 3 +
  (1 to ((entry - 1) / 5)).sum * 5 -
  (1 to ((entry - 1) / 15)).sum * 15
}

allMultiplesSum(1000)

