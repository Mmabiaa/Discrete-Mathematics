# Function to implement Disjunction

def check_disjunction(p, q):
    if (p or q) == True:
        return True
    else:
        return False

result = check_disjunction(False, True)
print(result)  # output true

result = check_disjunction(True, False)
print(result)  # output true

result = check_disjunction(True, True)
print(result)  # output true

result = check_disjunction(False, False)
print(result)  # output false