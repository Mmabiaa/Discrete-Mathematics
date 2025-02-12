#include "NOT_Gate.h"

int NOT_Gate::is_NOT_Gate(int x)
{
    if (x >=0 && x <=1)
    {
        if(x==1)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    else
    {
        cout<< "Inputs must be 0 or 1 \n";
    }
}
