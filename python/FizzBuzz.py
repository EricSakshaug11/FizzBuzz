import sys

def fizzbuzz(x):
    if x % 3 == 0:
        if x % 5 == 0:
            return 'FizzBuzz'
        else:
            return 'Fizz'
    elif x % 5 == 0:
        return 'Buzz'
    else:
        return str(x)

print "\n".join(fizzbuzz(int) for int in range(1,101))
