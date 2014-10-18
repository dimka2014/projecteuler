def gcd(a: BigInt, b: BigInt):BigInt = if (b == BigInt(0)) a else gcd(b, a % b)

def lcd(a: BigInt, b: BigInt):BigInt = a * b / gcd(a, b)

def lcdOfRange(range: Range): BigInt = {
  if (range.isEmpty) 1
  else lcd(range.head, lcdOfRange(range.tail))
}

lcdOfRange(1 to 20)
