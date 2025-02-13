# Functions Demonstrating Conjunctions

def check_conjunction(p,q):
    if (p and q) == True:
        return True
    else:
        return False

result = check_conjunction(False,True)
print(result) # output false

result = check_conjunction(True,True)
print(result) # output true