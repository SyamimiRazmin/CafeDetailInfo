package cafedetailsinfo;

public class drinks {

    private String drinksName, drinksType;
    private double drinksPrice;
    private int drinksQuantity;

    drinks(String drinksName, String drinksType, double drinksPrice, int drinksQuantity) {
        this.drinksName = drinksName;
        this.drinksPrice = drinksPrice;
        this.drinksQuantity = drinksQuantity;
        this.drinksType = drinksType;
    }

    String getdrinksName() {
        return drinksName;
    }

    String getdrinksType() {
        return drinksType;
    }

    double getdrinksPrice() {
        return drinksPrice;
    }

    int getdrinksQuantity() {
        return drinksQuantity;
    }

    void setdrinksPrice() {
        this.drinksPrice = drinksPrice;
    }

    void setdrinksType() {
        this.drinksType = drinksType;
    }

    void setdrinksQuantity() {
        this.drinksQuantity = drinksQuantity;
    }
}
