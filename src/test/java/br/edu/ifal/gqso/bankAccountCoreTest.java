package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class bankAccountCoreTest {
  private bankAccountCore account;

  @BeforeEach
  public void setUp() {
    this.account = new bankAccountCore();
  }

  @Test
  void testDeposit(){
    assertEquals(100, account.deposit(100));
    assertEquals(200, account.deposit(200));
    assertEquals(29, account.deposit(29));
  }

  @Test
  void testDepositIsValid() {
    assertEquals(true, account.depositIsValid(1));
    assertEquals(true, account.depositIsValid(29));
  }

  @Test
  void testDraftIsValid() {
  }
}