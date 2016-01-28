def square = (x: Int) => x * x

val range = 1 to 100

square(range.sum) - range.map(square).sum
