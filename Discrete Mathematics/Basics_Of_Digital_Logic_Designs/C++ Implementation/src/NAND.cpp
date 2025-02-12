#include "NAND.h"
#include <iostream>

int NAND::is_NAND_Gate(int x, int y)
{
    if ((x&&y)>=0&&(x&&y)<=1)
    {
        if((x&&y)!= 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
