package br.edu.ifal.gqso;

public class bankAccountCore {
  double balance=0;

  double deposit (double value){
    System.out.println("O saldo atual foi de: "+balance+" para "+(balance+=value));
    return balance;
  }

  boolean depositIsValid(double value) {
    if (value > 0) {
      deposit(value);
      return true;
    }
    return false;
  }

  void draftIsValid(double value) {

  }

  double checkBalance() {
    return balance;
  }

}
