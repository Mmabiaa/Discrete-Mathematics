# Implementation of NOT gate in python

def NOT(input):
    if input in range(0, 2):
        if input == 1:
            return 0
        else:
            return 1


# test
output = NOT(1)
print(output)  # output = 0

output = NOT(0)
print(output) # output = 1