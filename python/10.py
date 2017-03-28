import math

def is_prime(entry):
    for x in range(2, math.floor(math.sqrt(entry)) + 1):
        if entry % x == 0:
            return False
    return True

def findSum(to):
    return sum([x for x in range(2, to) if is_prime(x)])

if __name__ == "__main__":
    print(findSum(2000000))
