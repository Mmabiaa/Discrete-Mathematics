## implementation of the XOR operation

def XOR(input_1, input_2):
    if (input_1 and input_2) in range(0,2):

       if (input_1 or input_2) == '1' and not (input_1 and input_2):
           return 1
       else:
            return 0

    else:
        return'Invalid input(s). Input must be 1 or 0'
    
## test
output = XOR(1, 1)
print(output) # output = 0

output = XOR(1, 0)
print(output) # output : 1

output = XOR(0, 0)
print(output) # output : 0

output = XOR(0, 1)
print(output) # output : 1