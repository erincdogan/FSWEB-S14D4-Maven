package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean isDark;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, boolean isDark) {
        super(type, price, description);
        this.isDark = isDark;
    }

    @Override
    public void showDetails(){
        System.out.println("Tip: "+getType()+" Price: "+ getPrice()+ " Description: "+ getDescription()+ " Dark: "+ isDark);
    }
}
