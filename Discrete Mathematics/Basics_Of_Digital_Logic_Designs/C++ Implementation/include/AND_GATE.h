#ifndef AND_GATE_H
#define AND_GATE_H

#include <Gates.h>


class AND_GATE : public Gates
{
    private:
        int is_AND_GATE(int x, int y);
        int is1(), is0();
};

#endif // AND_GATE_H
