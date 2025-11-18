package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
products[0] = new Bread("black", 15,"healty", false, "black");
products[1] = new Chocolate("bitter", 50, "healty", "black", false);
products[2] = new Coke("zero", 100, "cola zero", true, false);

      listProducts(products);
    }


   public static void listProducts(ProductForSale[] products) {
for(ProductForSale product:products){
    if(product != null){
        product.showDetails();
    }
}
}
}