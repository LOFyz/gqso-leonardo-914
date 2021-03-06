package br.edu.ifal.gqso;

public class bankAccountCore {
  double balance = 0;

  double deposit(double value) {
    if (depositIsValid(value)) {
      System.out.println("O saldo atual foi de: " + balance + " para " + (balance += value));
    }else{
      System.out.println("Não foi possivel realizar esse deposito.");
    }
    return balance;
  }

  boolean depositIsValid(double value) {
    if (value > 0) {
      return true;
    }
    return false;
  }

  double draft(double value) throws Exception {
    if(draftIsValid(value)){
      System.out.println("O saldo atual foi de: " + balance + " para " + (balance -= value));
    }else{
      System.out.println("Não foi possivel realizar esse saque.");
    }
    return balance;
  }

  boolean draftIsValid(double value) throws Exception {
    if(value<=0){
      return false;
    }
    if(value>balance){
      throw new Exception("SaldoInsuficiente");
    }
    if(value<=balance){
      return true;
    }
    return false;
  }

  double checkBalance() {
    return balance;
  }

}
