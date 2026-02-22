package org.example.model;

public class Store {
    public static void main(String[] args) {
    ProductForSale[] products = new ProductForSale[3];
    products[0] = new Chocolate("Sütlü", 7, "Fıstıklı", false);
    products[1] = new Coke("Kola", 5, "1 litre", true);
    products[2] = new Bread("Wheat", 3, "Taze", true);
        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}