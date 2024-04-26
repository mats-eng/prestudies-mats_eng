package prestudiesWeek3.computers;

public class Computer {
    private String manufactName;
    private String modelName;
    private int processorSpeedMHz;
    private int ramSizeGb;
    private int hardDriveSizeGb;
    private int numbOfUsbPorts;
    private int screenSizeInch;
    private String compType;
    private Boolean hasOS;
    private double purchasingPrice;
    private double sellingPrice;

    public Computer() {

    }

    public Computer(String manufactName, String modelName, int processorSpeedMHz, int ramSizeGb, int hardDriveSizeGb, int numbOfUsbPorts, int screenSizeInch, String compType, Boolean hasOS, double purchasingPrice, double sellingPrice) {
        this.manufactName = manufactName;
        this.modelName = modelName;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramSizeGb = ramSizeGb;
        this.hardDriveSizeGb = hardDriveSizeGb;
        this.numbOfUsbPorts = numbOfUsbPorts;
        this.screenSizeInch = screenSizeInch;
        this.compType = compType;
        this.hasOS = hasOS;
        this.purchasingPrice = purchasingPrice;
        this.sellingPrice = sellingPrice;
    }

    public Computer(String manufactName, byte screenSizeInch, Boolean hasOS) {
        this.manufactName = manufactName;
        this.screenSizeInch = screenSizeInch;
        this.hasOS = hasOS;
    }

    public String getManufactName() {
        return manufactName;
    }

    public void setManufactName(String manufactName) {
        this.manufactName = manufactName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getProcessorSpeedMHz() {
        return processorSpeedMHz;
    }

    public void setProcessorSpeedMHz(int processorSpeedMHz) {
        this.processorSpeedMHz = processorSpeedMHz;
    }

    public int getRamSizeGb() {
        return ramSizeGb;
    }

    public void setRamSizeGb(int ramSizeGb) {
        this.ramSizeGb = ramSizeGb;
    }

    public int getHardDriveSizeGb() {
        return hardDriveSizeGb;
    }

    public void setHardDriveSizeGb(int hardDriveSizeGb) {
        this.hardDriveSizeGb = hardDriveSizeGb;
    }

    public int getNumbOfUsbPorts() {
        return numbOfUsbPorts;
    }

    public void setNumbOfUsbPorts(int numbOfUsbPorts) {
        this.numbOfUsbPorts = numbOfUsbPorts;
    }

    public int getScreenSizeInch() {
        return screenSizeInch;
    }

    public void setScreenSizeInch(int screenSizeInch) {
        this.screenSizeInch = screenSizeInch;
    }

    public String getCompType() {
        return compType;
    }

    public void setCompType(String compType) {
        this.compType = compType;
    }

    public Boolean getHasOS() {
        return hasOS;
    }

    public void setHasOS(Boolean hasOS) {
        this.hasOS = hasOS;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public String toString() {
        return "Manufacturer: " + manufactName + "\n" +
                "Processor Speed: " + processorSpeedMHz + " MHz\n" +
                "RAM Size: " + ramSizeGb + " GB\n" +
                "Hard Drive Size: " + hardDriveSizeGb + " GB\n" +
                "Number of USB Ports: " + numbOfUsbPorts + "\n" +
                "Screen Size: " + screenSizeInch + " inches\n" +
                "Computer Type: " + compType + "\n" +
                "Preinstalled Operating System: " + (hasOS ? "Yes\n" : "No\n");
    }

    public double calculateProfit() {
        return sellingPrice - purchasingPrice;
    }
}
