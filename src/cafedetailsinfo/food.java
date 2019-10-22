package cafedetailsinfo;

public class food {

    private String foodName;
    private double foodPrice;
    private int foodQuantity;
    private String foodType;
    food(String foodName, double foodPrice, int foodQuantity, String foodType) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodQuantity = foodQuantity;
        this.foodType = foodType;
    }

    String getfoodName() {
        return this.foodName;
    }

    double getfoodPrice() {
        return this.foodPrice;
    }

    int getfoodQuantity() {
        return this.foodQuantity;
    }
    
    String getfoodType(){
        return this.foodType;
    }

    void setfoodPrice() {
        this.foodPrice = foodPrice;
    }

    void setfoodQuantity() {
        this.foodQuantity = foodQuantity;
    }
}
