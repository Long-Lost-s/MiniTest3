package Material;

import Discount.Discount;

import java.util.ArrayList;
import java.util.List;

public class MaterialList {
    private List<Material> materials = new ArrayList<Material>();

    public MaterialList(List<Material> materials) {
        this.materials = (materials !=null) ? materials : new ArrayList<>();
    }

    public void add(Material material) {
        materials.add(material);
    }

    public void update(Material material) {
        int index = materials.indexOf(material);
        if (index != -1) {
            materials.set(index, material);
        } else {
            System.out.println("Material not found");
        }
    }

    public void remove(Material material) {
        if (materials.contains(material)) {
            materials.remove(material);
        } else {
            System.out.println("Material not found");
        }
    }

    public double totalAmount() {
        double sum = 0;
        for (Material material : materials) {
            sum += material.getAmount();
        }
        return sum;
    }

    public double totalDiscountAmount() {
        double sum = 0;
        for (Material material : materials) {
            if(material instanceof Discount) {
                sum += ((Discount) material).getRealMoney();
            }
        }
        return sum;
    }

    public List<Material> sortByCost() {
        int n = materials.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (materials.get(j).getCost() > materials.get(j + 1).getCost()) {
                    Material temp = materials.get(j);
                    materials.set(j, materials.get(j + 1));
                    materials.set(j + 1, temp);
                }
            }
        }
        return materials;
    }

}
