package org.example.model;

public enum CurrencyPool {


      one_SEK (1),
      two_SEK (2),
      five_SEK (5),
      ten_SEK (10),
      twenty_SEK (20),
      fifty_SEK (50),
      oneHundred_SEK (100),
      twoHundred_SEK (200),
      fiveHundred_SEK (500),
      oneThousand_SEK (1000);


    private final int value;

    CurrencyPool(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}




