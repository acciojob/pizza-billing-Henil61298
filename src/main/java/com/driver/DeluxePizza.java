package com.driver;

public class DeluxePizza extends Pizza {
//    Extra Cheese Price = 80
//    Extra Toppings For Veg Pizza = 70
//    Extra Toppings For Non-veg Pizza = 120

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraToppings();
        super.addExtraCheese();
    }
}
