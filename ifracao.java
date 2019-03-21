import org.jmlspecs.models.JMLDouble;

public interface IFracao {
  /*@
    @ instance initially getNumerador() == 1;
    @ instance initially getDenominador() == 1;
    @*/

    /*@
      @ ensures getNumerador() == n;
      @*/
    void setNumerador(int n);

  /*@ pure @*/ int getNumerador();

    /*@ requires n != 0;
      @ ensures getDenominador() == n;
      @*/
    void setDenominador(int n);

  //@ ensures \result != 0;
  /*@ pure @*/ int getDenominador();

  // ensures \result == (double)(getNumerador() / getDenominador());
  //@ ensures JMLDouble.approximatelyEqualTo(\result, (double)getNumerador() / (double)getDenominador(), (double)0.0001);
  double valorDecimal();

  //@ also
  //@   ensures \result.equals(getNumerador()+"/"+getDenominador());
  @Override
  String toString();
}