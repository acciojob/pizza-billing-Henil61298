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
        this.isBillGenerated = false;
        this.extraCheeseAddedd = false;
        this.paperBagAdded = false;
        this.extraToppingsAdded  = false;
        if (isVeg){
            this.price = 300;

            this.isVeg = true;
        }else {
            this.price = 400;
            this.isVeg = false;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.extraCheeseAddedd) {
            this.price += 80;
            this.extraCheeseAddedd = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.extraToppingsAdded) {
            if (!isVeg) {
                this.price += 120;
//                bill += "Extra Toppings Added: 120\n";
            } else {
                this.price += 70;
//                bill += "Extra Toppings Added: 70\n";
            }
            this.extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!this.paperBagAdded) {
            this.price += 20;
//            bill += "Paperbag Added: 20\n";
            this.paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (isVeg){
            this.bill = "Base Price Of The Pizza: " + 300 + "\n";
        }

        if (!isVeg){
            this.bill = "Base Price Of The Pizza: " + 400 + "\n";
        }

        if (this.extraCheeseAddedd){
            this.bill += "Extra Cheese Added: " + 80 + "\n";
        }

        if (this.extraToppingsAdded && isVeg){
            this.bill += "Extra Toppings Added: " + 70 + "\n";
        }

        if (this.extraToppingsAdded && !isVeg){
            this.bill += "Extra Toppings Added: " + 120 + "\n";
        }

        if (this.paperBagAdded){
            this.bill += "Paperbag Added: 20\n";
        }

        this.bill += "Total Price: " + price + "\n";
        this.isBillGenerated = true;
        return this.bill;
    }
}
