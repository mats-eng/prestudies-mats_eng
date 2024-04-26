package prestudiesWeek3.computers;

import java.util.ArrayList;

public class ComputerShop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public ComputerShop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public double calculateGrossShopProfit() {
        double grossShopProfit = 0.0;
        for (Computer computer : computers) {
            grossShopProfit += computer.calculateProfit();
        }
        return grossShopProfit;
    }

    public double calculateMargin() {
        double totalSellingPrice = 0;
        double totalPurchasePrice = 0;
        for (Computer computer : computers) {
            totalPurchasePrice += computer.getPurchasingPrice();
            totalSellingPrice += computer.getSellingPrice();
        }
        double margin = (totalSellingPrice/totalPurchasePrice)-1;
        return margin;
    }
}

