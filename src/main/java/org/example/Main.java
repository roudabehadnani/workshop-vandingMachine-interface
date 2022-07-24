package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {

        Drink coca = new Drink("Coca", 100, 20, "Medium", false);
        Drink bear = new Drink("Bear", 101, 50, "Big", true);

        Snack pizza = new Snack("Mini Pizza", 1, 50, "Sausage, Cheese");
        Snack applePie = new Snack("Apple Pie", 2, 10,"apple, cinnamon");

        Candy chocolate = new Candy("Chocolate", 50, 10, "Chocolate");
        Candy candy = new Candy("Candy", 51, 5, "Strawberry");


        VendingMachineImpl vendingMachine =
                new VendingMachineImpl(new Product[]{coca, bear, chocolate, candy, pizza, applePie});

        System.out.println("//--------All of the products");
        Product[] allProducts = new Product[]{coca, bear, chocolate, candy, pizza, applePie};
        for (Product all: allProducts) {
            System.out.println(all.examine());
        }


        System.out.println("//--------addCurrency");
        vendingMachine.addCurrency(500);


        System.out.println("//--------getBalance");
        System.out.println("vendingMachine.getBalance() = " + vendingMachine.getBalance());


        System.out.println("//--------request your product");
        vendingMachine.request(1);
        System.out.println("product Description = " + vendingMachine.getDescription(1));
        System.out.println("getBalance = " + vendingMachine.getBalance());


        System.out.println("//--------endSession");
        System.out.println("Return money = " + vendingMachine.getBalance());
        System.out.println("Balance = " + vendingMachine.endSession());

    }
}