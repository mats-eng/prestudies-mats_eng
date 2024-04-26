package prestudiesWeek3.computers;

import java.util.Locale;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("HP", "14 Spectre", 5000, 8, 500, 2, 14, "Ultrabook", true, 621.00 , 755.46));
        computerList.add(new Computer("Lenovo", "IdeaPad Slim 3 15 (2023)", 2100, 16, 500, 2, 15, "Laptop", true, 411.00, 587.39));
        computerList.add(new Computer("Dell", "OptiPlex 7010", 2400, 16, 1000, 3, 14, "Computer", false, 380.89, 545.39));
        computerList.add(new Computer("Apple", "MacBook Pro", 2600, 32, 1000, 4, 16, "Notebook", true, 1302.98, 1679.83));
        computerList.add(new Computer("Huawei", "MateStation B515", 1800, 8, 250, 8, 15, "Computer", false, 170.03, 224.13));

        computerList.get(0).setRamSizeGb(computerList.get(0).getRamSizeGb() * 2);

        System.out.println("Computer properties:");
        System.out.println(computerList.get(0).toString());

        System.out.print("Profit per piece of " + computerList.get(0).getManufactName() + " " + computerList.get(0).getModelName() + ": ");
        System.out.print(String.format(Locale.ENGLISH,"%.2f€", computerList.get(0).calculateProfit()) + "\n");

        ComputerShop shop = new ComputerShop(computerList);
        double grossShopProfit = shop.calculateGrossShopProfit();
        double margin = shop.calculateMargin();

        System.out.println(String.format(Locale.ENGLISH,"The gross shop profit is: %.2f€",grossShopProfit));
        System.out.println(String.format(Locale.ENGLISH, "The margin is: %.2f", margin));
    }
}

