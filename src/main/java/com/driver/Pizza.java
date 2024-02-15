package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isBillGenerated;

    boolean extraCheeseAddedd;

    boolean paperBagAdded;

    boolean extraToppingsAdded;

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
        isBillGenerated = false;
        extraCheeseAddedd = false;
        paperBagAdded = false;
        extraToppingsAdded  = false;
        if (isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: " + 300 + "\n";
            this.isVeg = true;
        }else {
            price = 400;
            bill = "Base Price Of The Pizza: " + 400 + "\n";
            this.isVeg = false;
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
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            if (!isVeg) {
                price += 120;
//                bill += "Extra Toppings Added: 120\n";
            } else {
                price += 70;
//                bill += "Extra Toppings Added: 70\n";
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!paperBagAdded) {
            price += 20;
//            bill += "Paperbag Added: 20\n";
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (extraCheeseAddedd){
            bill += "Extra Cheese Added: 80\n";
        }

        if (extraToppingsAdded && isVeg){
            bill += "Extra Toppings Added: " + 70 + "\n";
        }

        if (extraToppingsAdded && !isVeg){
            bill += "Extra Toppings Added: " + 120 + "\n";
        }

        if (paperBagAdded){
            bill += "Paperbag Added: 20\n";
        }
        if (!isBillGenerated) {
            bill += "Total Price: " + price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
