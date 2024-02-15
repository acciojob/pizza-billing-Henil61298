package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAddedd = false;

    private boolean paperBagAdded = false;

    private boolean extraToppingsAdded = false;

//    Veg pizza base price = 300
//    Non-veg pizza base price = 400
////    Extra Cheese Price = 80
//    Extra Toppings For Veg Pizza = 70
//    Extra Toppings For Non-veg Pizza = 120
//    Paper bag Price = 20

//    Base Price Of The Pizza: 300
//    Extra Cheese Added: 80
//    Extra Toppings Added: 70
//    Paperbag Added: 20
//    Total Price: 470

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: " + 300 + "\n";
        }else {
            price = 400;
            bill = "Base Price Of The Pizza: " + 400 + "\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAddedd) {
            price += 80;
            extraCheeseAddedd = true;
            bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            if (!isVeg) {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            } else {
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!paperBagAdded) {
            price += 20;
            bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
