package com.example.demo;
import org.junit.jupiter.api.Test;

import com.example.demo.money.Dollar;

import static org.junit.jupiter.api.Assertions.*;
public class MoneyTest {
  
  @Test
  public  void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10,five.amount);
  }

}
