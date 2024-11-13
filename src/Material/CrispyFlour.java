package Material;
import Discount.Discount;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufactureDate, int cost, int quantity) {
        super(id, name, manufactureDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufactureDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return getAmount() * 0.94;
    }

    public String toString() {
        return quantity + " " + super.toString();
    }

}
