package org.example.model;

public class Coke extends  ProductForSale{
    private boolean isDiet;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails(){
        System.out.println("Tip: "+getType()+" Price: "+ getPrice()+ " Description: "+ getDescription()+ " Diet: " + isDiet);
    }
}
