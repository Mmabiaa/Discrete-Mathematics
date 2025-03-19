# Function implementation for AND operation

def NAND(input_1, input_2):
    if (input_1 and input_2) in range(0,2):
        if not(input_1 and input_2) == 1:
            return 1
        else:
            return 0
    else:
        return'Invalid input(s). Input must be 1 or 0'

## test
output = NAND(1, 1)
print(output) # output = 0

output = NAND(1, 0)
print(output) # output = 1

output = NAND(0,0)
print(output) # output = 1