public interface IFila {
    //@instance initially size() == 0

    //@requires isFull() == False
    //@ensures last() == v
    //@ensures size() == \old(size()) + 1
    //@ensures isEmpty == False
    public void enqueue(int v);

    //@requires isEmpty() == False
    //@ensures size() == \old(size()) - 1
    //@ensures isFull() == False
    //@ensures result == \old(first())
    public int dequeue();

    //@requires isEmpty() == false
    /*@ pure @*/public int first();

    //@requires isEmpty() == false
    /*@ pure @*/public int last();

    /*@ pure @*/public int size();

    /*@ pure @*/boolean isEmpty();

    /*@ pure @*/boolean isFull();
}
