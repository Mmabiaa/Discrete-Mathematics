# A function to implement exclusive disjunction

def check_exclusive_disjunction(p, q):
    if (p or q) == True and not (p and q):
        return True
    else:
        return False

result = check_exclusive_disjunction(False, True)
print(result) # output: True

result = check_exclusive_disjunction(True, True)
print(result) # output: False

result = check_exclusive_disjunction(True, False)
print(result) # output: True

result = check_exclusive_disjunction(False, False)
print(result) # output: False