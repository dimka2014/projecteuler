def isPrime(x: Int) =
  (1 until x / 2 + 1).count(x % _ == 0) < 2

Stream.from(1).filter(isPrime).take(10002).last