# implementation of negation proposition

def apply_negation(p):
    if p == True:
        return False
    else:
        return True

result = apply_negation(True)
print(result) # output: False

result = apply_negation(False)
print(result) # output: True
