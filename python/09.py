def findTriplet():
    for a in range(1, 1000):
        for b in range(1, 1000):
            c = 1000 - a - b
            if c > 0 and a*a + b*b == c*c:
                return (a, b, c)

if __name__ == "__main__":
    (a, b, c) = findTriplet()
    print(a * b * c)
