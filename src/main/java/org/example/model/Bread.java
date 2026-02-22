package org.example.model;

public class Bread extends ProductForSale{
    private boolean isWhite;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean isWhite) {
        super(type, price, description);
        this.isWhite = isWhite;
    }

    @Override
    public void showDetails(){
        System.out.println("Tip: "+getType()+" Price: "+ getPrice()+ " Description: "+ getDescription()+ " White: " + isWhite);
    }
}
