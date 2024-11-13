import Material.Material;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Material.Material;
import Material.CrispyFlour;
import Material.Meat;
import Material.MaterialList;
import Discount.Discount;

public class Main {
    public static void main(String[] args) {
        List<Material> materials = new ArrayList<>();
        materials.add(new CrispyFlour("C1", "ChickenFlour", LocalDate.now(), 100, 3));
        materials.add(new CrispyFlour("C2", "DuckFlour", LocalDate.now(), 80, 5));
        materials.add(new CrispyFlour("C3", "DogFlour", LocalDate.now(), 200, 7));
        materials.add(new CrispyFlour("C4", "CatFlour", LocalDate.now(), 250, 1));
        materials.add(new CrispyFlour("C5", "HumanFlour", LocalDate.now(), 400, 8));
        materials.add(new Meat("M1", "ChickenMeat", LocalDate.now(), 200, 10));
        materials.add(new Meat("M2", "DuckMeat", LocalDate.now(), 150, 6));
        materials.add(new Meat("M3", "DogMeat", LocalDate.now(), 400, 20));
        materials.add(new Meat("M4", "CatMeat", LocalDate.now(), 500, 18));
        materials.add(new Meat("M5", "HumanMeat", LocalDate.now(), 700, 13));

        MaterialList materialList = new MaterialList(materials);
        for(Material material: materials){
            System.out.println(material);
        }

        System.out.println("Total cost for all of the list before discount is: " + materialList.totalAmount());
        System.out.println("Total cost for all of the list after discount is: " + materialList.totalDiscountAmount());
        System.out.println("Value different between cost and real cost is: " +(materialList.totalAmount() - materialList.totalDiscountAmount()));

        List<Material> sortedMaterials = materialList.sortByCost();
        System.out.println("Ordered material list by cost is: ");
        for(Material material: sortedMaterials){
            System.out.println(material);
        }
        
    }
}