package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza p = new DeluxePizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();
    System.out.println(p.getBill());
    System.out.println(p.getBill());

//    Pizza p = new Pizza(false);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();


  }
}