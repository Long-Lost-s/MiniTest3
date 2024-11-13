package Material;
import Discount.Discount;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufactureDate, int cost, double weight) {
        super(id, name, manufactureDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufactureDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return getAmount() * 0.97;
    }

    public String toString() {
        return weight + " " + super.toString();
    }
}
