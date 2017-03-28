def isPalindromic(entry: Int): Boolean = {
  val charArray = entry.toString.toCharArray
  var i = 0
  while (i < charArray.length / 2) {
    if (charArray(i) != charArray(charArray.length - i - 1)) {
      return false
    }
    i += 1
  }
  true
}

var result = Set[Int]()
var i = 100
while (i < 1000) {
  var j = 100
  while (j < 1000) {
    val temp = i * j
    if (isPalindromic(temp)) {
      result += temp
    }
    j += 1
  }
  i += 1
}

print(result.max)
