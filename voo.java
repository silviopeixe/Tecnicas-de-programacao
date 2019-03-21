public class Counter {
    private int cont;

    //@ ensures getCount() == 0;
    public Counter(){
        cont = 0;
    }

    //@ ensures \result >= 0;
    public /*@ pure @*/ int getCount(){
        return(cont);
    }

    //@ ensures getCount() == 0;
    public void reset(){
        cont = 0;
    }

    //@ ensures getCount() == \old(getCount()) + 1;
    public void click(){
        cont++;
    }
}