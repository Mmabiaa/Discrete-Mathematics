#include "AND_GATE.h"

int AND_GATE::is_AND_GATE(int p, int q)
{
    if(((p&&q)>=0) && ((p&&q)<=1))
    {
        if((p&&q)==1)
        {
            is1();
        }
        else
        {
            is0();
        }
    }
}

int AND_GATE::is1()
{
    return 1;
}

int AND_GATE::is0()
{
    return 0;
}
