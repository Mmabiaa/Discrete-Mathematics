# Logic Gates
- **Logic Gate:** is the smallest possible processing unit of a digital system.
-**Logic Gate:** takes a group of inputs and produces an output.

### Notes
- The smallest representation unit is **one bit (short for binary digit)**
- Digital systems are to manipulate discrete information which are represented in **voltages and current**
- **High voltage is denoted by '1'**
- **Low voltage is denoted by '0'**
- The truth values are represented as **1 and 0** for **true and false respectively**.

## Types Of Logic Gates
- NOT gate
- AND gate
- OR gate
- NAND gate
- NOR gate
- XOR gate


## NOT gate 
- This converts an input from 0 to 1
- This is also called the **inverter**

### Symbol
- This is denoted by **~**:
![](/Basics_Of_Digital_Logic_Designs/img/NOT.png)

### Truth Table
Check [NOT Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/NOT.csv)
"A","Y (NOT A)"
"0","1"
"1","0"


## AND gate
- The output is **1** if and only **if both input are 1**
- Otherwise 0.

### Symbol
The symbol for the AND gate is represented as **(p ʌ q)**:
![](/Basics_Of_Digital_Logic_Designs/img/AND.jpeg)

### Truth Table
Check [AND Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/AND.csv)
"A","B","Y (A AND B)"
"0","0","0"
"0","1","0"
"1","0","0"
"1","1","1"


## NAND gate
- The output is **1** if and only **if both input are not 1**
- Otherwise 0.

### Symbol
The symbol for the NAND gate is represented as **~(p ʌ q)**:
![](/Basics_Of_Digital_Logic_Designs/img/NAND.jpeg)

### Truth Table
Check [NAND Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/NAND.csv)
"A","B","Y (A NAND B)"
"0","0","1"
"0","1","1"
"1","0","1"
"1","1","0"



## OR gate
- The output is **1** if and only **if either input is 1**
- Otherwise 0.

### Symbol
The symbol for the OR gate is represented as **(p V q)**:
![](/Basics_Of_Digital_Logic_Designs/img/OR.jpeg)

### Truth Table
Check [OR Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/OR.csv)
"A","B","Y (A OR B)"
"0","0","0"
"0","1","1"
"1","0","1"
"1","1","1"


## NOR gate
- The output is **0** if and only **if at least one input are 1**
- Otherwise 1.

### Symbol
The symbol for the NOR gate is represented as **~(p V q) or p ↓ q (↓ is called Pierce Arrow)**:
![](/Basics_Of_Digital_Logic_Designs/img/NOR.jpeg)

### Truth Table
Check [NOR Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/AND.csv)
"A","B","Y (A NOR B)"
"0","0","1"
"0","1","0"
"1","0","0"
"1","1","0"

## XOR gate
- The output is **1** if and only **if exactly ONE input is 1**
- Otherwise 0.

### Symbol
The symbol for the XOR gate is represented as **(p ⊕ q)**:
![](/Basics_Of_Digital_Logic_Designs/img/XOR.jpeg)

### Truth Table
Check [XOR Truth Table File](/Basics_Of_Digital_Logic_Designs/Truth_Tables/XOR.csv)
"A","B","Y (A XOR B)"
"0","0","0"
"0","1","1"
"1","0","1"
"1","1","0"
