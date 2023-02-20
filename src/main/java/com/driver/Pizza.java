package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillingCreated;
    boolean isTakeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else  {
            this.price=400;
            this.toppings=120;
        }
       this.isExtraCheeseAdded=false;
        this.isExtraToppingAdded=false;
        this.isBillingCreated=false;
        this.isTakeAway=false;

        this.bill ="Base Price of the Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            this.price += 80;
        this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingAdded){
            this.price+=this.toppings;
                    this.isExtraToppingAdded=true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillingCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            isBillingCreated=true;
            return this.bill;
        }
        return "";
    }
}
