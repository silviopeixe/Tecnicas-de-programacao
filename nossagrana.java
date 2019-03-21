public class NossaGranaBancoStatus {
    //@ ensures getSaldo() == 0; 
    //@ ensures getStatus().equals("Comum");
    public NossaGranaBancoStatus(){

    }

    //@ ensures getSaldo() >= 0;
    public /* @ pure @ */ int getSaldo() {
        return 0;
    }

    //@ ensures \result.equals("Comum") || \result.equals("Especial");
    public /*@ pure @*/ String getStatus(){
        return null;
    }

    //@ requires valor > 0;
    //@ requires getSaldo() >= valor;
    //@ ensures getSaldo() == \old(getSaldo()) - valor;
    //@ ensures getSaldo() <= 9999 ==> getStatus().equals("Comum");
    //@ ensures getSaldo() >  9999 ==> getStatus().equals("Especial");
    public void retirada(int valor) {
        
    }

    //@ requires valor > 0;
    //@ requires getSaldo() <= 9999;
    //@ ensures getSaldo() == \old(getSaldo()) + valor;
    //@ ensures getStatus().equals("Comum");
    //@
    //@ also
    //@
    //@ requires valor > 0; 
    //@ requires getSaldo() >= 10000;
    //@ ensures getSaldo() == \old(getSaldo())+valor+10;
    //@ ensures getStatus().equals("Especial");
    public void deposito(int valor) {
    };
}