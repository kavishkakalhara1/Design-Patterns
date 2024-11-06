// SugarDecorator.java
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;  // adding cost for sugar
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
