
package cafedetailsinfo;


public class snacks {
    private String snacksName;
    private double snacksPrice;
    private int snacksQuantity;
    
    snacks(String snacksName, double snacksPrice, int snacksQuantity){
        this.snacksName = snacksName;
        this.snacksPrice = snacksPrice;
        this.snacksQuantity = snacksQuantity;
    }
    
   String getsnacksName(){
       return snacksName;
   }
   
   double getsnacksPrice(){
       return snacksPrice;
   }
   
   int getsnacksQuantity(){
       return snacksQuantity;
   }
   
   void setsnacksPrice(){
       this.snacksPrice = snacksPrice;
   }
   
   void setsnacksQuantity(){
       this.snacksQuantity = snacksQuantity;
   }
}
