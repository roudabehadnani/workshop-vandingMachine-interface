package org.example.model;

public class Candy implements Product{



    private String productName;
    private int id;
    private int price;
    private String type;


    public Candy(String productName, int id, int price, String type) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.type = type;
    }

    @Override
    public String examine() {
        return "Id:" + getId() +
                " ProductName:" + getProductName() +
                " Price:" + getPrice() +
                " type:" + getType();
    }

    @Override
    public String use() {
        return "Candy";
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
