def fibonacciSum(entry: Int) = {

  var penultimate = 0
  var ultimate = 1
  var sum = 0

  while (ultimate < entry) {
    if (ultimate % 2 == 0) {
      sum += ultimate
    }
    val next = penultimate + ultimate
    penultimate = ultimate
    ultimate = next
  }

  sum
}

fibonacciSum(4000000)
