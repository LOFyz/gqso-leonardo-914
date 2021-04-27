package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class bankAccountCoreTest {
  private bankAccountCore account;

  @BeforeEach
  public void setUp() {
    this.account = new bankAccountCore();
    account.balance=1000;
  }

  @Test
  void testDeposit(){
    assertEquals(1100, account.deposit(100));
    assertEquals(1300, account.deposit(200));
    assertEquals(1329, account.deposit(29));
    assertEquals(1329, account.deposit(0));
    assertEquals(1329, account.deposit(-29));
  }

  @Test
  void testDepositIsValid() {
    assertEquals(true, account.depositIsValid(1));
    assertEquals(true, account.depositIsValid(29));
    assertEquals(false, account.depositIsValid(0));
    assertEquals(false, account.depositIsValid(-29));
    assertEquals(false, account.depositIsValid(-1));
  }

  // A previsão desse teste é que o ultimo lançara a excessão.
  
  @Test
  void testDraftIsValid() throws Exception {
    assertEquals(true, account.draftIsValid(10));
    assertEquals(true, account.draftIsValid(1000));
    assertEquals(false, account.draftIsValid(10000));
  }
  
  // A previsão para essa função de teste é de que o ultimo
  // não será printado, pois a excessão será lançada antes dele
  // tendo assim apenas dois retornos de: 
  // "Não foi possivel realizar esse saque."

  @Test
  void testDraft() throws Exception {
    assertEquals(990, account.draft(10));
    assertEquals(890, account.draft(100));
    assertEquals(0, account.draft(890));
    assertEquals(0, account.draft(0));
    assertEquals(0, account.draft(-1));
    assertEquals(0, account.draft(1));
    assertEquals(0, account.draft(-1));
  }
}