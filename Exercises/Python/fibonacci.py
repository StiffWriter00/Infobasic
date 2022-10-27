#!/usr/bin/python3
# --------------------------
# ARRANGE FIBONACCI SEQUENCE
# --------------------------

try:

    nterms = int(input("\nHow many terms? --> "))
    print("")

    n1, n2 = 0, 1
    count = 0

    if nterms <= 0:
        print("Please, enter a positive integer!")
    else:
        print("Fibonacci sequence:")
        while count < nterms:
            print(n1)
            nth = n1 + n2
            n1 = n2
            n2 = nth
            count += 1
        print("")

except ValueError:
    print("Please, insert numbers only!\n")