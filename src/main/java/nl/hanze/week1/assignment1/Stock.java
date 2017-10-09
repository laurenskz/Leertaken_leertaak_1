package nl.hanze.week1.assignment1;

/**
 * Created by Laurens on 25-9-2017.
 */
public enum Stock {
    GOOGLE("Google",197.00),
    IBM("Ibm",677.60),
    AAPL("Aapl",676.40);

    private String name;
    private double initialPrice;

    Stock(String name, double initialPrice) {
        this.name = name;
        this.initialPrice = initialPrice;
    }


    public String getName() {
        return name;
    }

    public double getInitialPrice() {
        return initialPrice;
    }
}
