def calculatePrimeFactors(entry: BigInt): Set[BigInt] = {
  
  def getSmallestDivisor(entry: BigInt): BigInt = {
    var i = 2
    while (i < entry) {
      if ((entry mod i) == BigInt(0)) {
        return i
      }
      i += 1
    }
    i
  }

  val smallestDivisor = getSmallestDivisor(entry)
  if (smallestDivisor == entry) {
    Set(smallestDivisor)
  } else {
    Set(smallestDivisor) union calculatePrimeFactors(entry / smallestDivisor)
  }
}

calculatePrimeFactors(BigInt("600851475143"))
