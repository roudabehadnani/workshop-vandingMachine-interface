package org.example.model;


public class VendingMachineImpl implements VendingMachine{

    Product[] products;
    int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }


//Add money to the deposit pool. Only accepts the following values: 1,2,5,10,20,50,100,200,500,1000
    @Override
    public void addCurrency(int amount) {
        boolean correct = false;

        for (CurrencyPool c : CurrencyPool.values()) {
            if (c.getValue() == amount) {
                depositPool = depositPool + amount;
                System.out.println("depositPool = " + depositPool);
                correct = true;
            }
        }
        if (!correct){
            throw new IllegalArgumentException("Invalid money");
            }
}

//Returns the depositPool (not clearing it)
    @Override
    public int getBalance() {
        return this.depositPool;
    }


//Buy requested Product if there is enough money in the depositPool.
    @Override
    public Product request(int id) {

        for (Product p: products) {
            if (p.getId() == id) {
                if (depositPool >= p.getPrice()) {

                    depositPool = depositPool - p.getPrice();
                    return p;
                } else {
                    throw new IllegalArgumentException("Money is not enough");
                }

            }
        }
            throw new IllegalArgumentException("The product with id" + "'" + id + "'" + " is NOT found");
    }


//Returns depositPool and set it to 0.
    @Override
    public int endSession() {
        depositPool = 0;
        return depositPool;
    }


//Returns a String of a Product description
    @Override
    public String getDescription(int id) {

        for (Product pro: products) {
            if (pro.getId() == id){
                return pro.examine();
            }
        }
        throw new IllegalArgumentException("The product with id" + "'" + id + "'" + " is NOT found");
    }

//Returns String array where each String contains the Product’s id, name and price
    @Override
    public String[] getProducts() {
        String[] string = new String[products.length];

        for (int i = 0; i<products.length; i++){
            string[i] = products[i].examine().concat(" price:" + products[i].getPrice());
        }
        return string;
    }


    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }
}
