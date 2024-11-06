// SimpleCoffee.java
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.0;  // base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
