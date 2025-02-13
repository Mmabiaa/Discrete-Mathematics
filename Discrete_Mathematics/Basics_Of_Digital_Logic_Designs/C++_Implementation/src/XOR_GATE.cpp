#include "XOR_GATE.h"

int XOR_GATE::is_XOR_GATE(int x, int y)
{
    // XOR: For an XOR gate to output 1:
    //      X can be 1, Y can be 1
    //      For an XOR GATE to output 0:
    //      X AND Y are 0, or X and Y are both 1
    if ((x && y)<=1 && (x&&y)>=0)
    {
        if ((x==1 && y == 0) || (x==0&&y==1))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        cout<< "Input must 0 or 1\n";
    }
}
