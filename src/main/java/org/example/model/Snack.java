package org.example.model;

public class Snack implements Product{



    private String productName;
    private int id;
    private int price;
    private String ingredient;


    public Snack(String productName, int id, int price, String ingredient) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.ingredient = ingredient;
    }


    @Override
    public String examine() {
        return "Id:" + getId() +
                " ProductName:" + getProductName() +
                " Price:" + getPrice() +
                " ingredient:" + getIngredient();
    }

    @Override
    public String use() {
        return "Snack";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
