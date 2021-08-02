package inheritance;

import interFases.ShopInterFace;

public class Shop implements ShopInterFace {
    private String name;
    private String description;
    private int numOfDollarSigns;

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public void setNumOfDollarSigns(int numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }
}
