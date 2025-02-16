#include "NOR_Gate.h"

int NOR_Gate::is_NOR_Gate(int x, int y)
{
    if ((x && y)<=1 && (x&&y)>=0)
    {
        if ((x||y)!= 1)
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
        cout<< "Inputs must be 0 or 1 \n";
    }
}
