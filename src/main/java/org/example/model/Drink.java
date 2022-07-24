package org.example.model;

public class Drink implements Product{

    private String productName;
    private int id;
    private int price;
    private String size;
    private boolean alcoholic;

    public Drink(String productName, int id, int price, String size, boolean alcoholic) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.size = size;
        this.alcoholic = alcoholic;
    }

    @Override
    public String examine() {
        return "Id:" + getId() +
                " ProductName:" + getProductName() +
                " Price:" + getPrice() +
                " Size:" + getSize() +
                " Alcoholic:" + isAlcoholic();
    }

    @Override
    public String use() {
        return "Drink" ;
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


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

}
