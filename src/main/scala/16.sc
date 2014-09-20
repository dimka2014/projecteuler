def sumOfDigits(number: BigInt, power: Int) = {
  number
    .pow(power)
    .toString
    .toCharArray
    .map(x => Integer.parseInt(x.toString))
    .sum
}
sumOfDigits(2, 1000)
