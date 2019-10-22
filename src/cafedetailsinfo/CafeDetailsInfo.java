package cafedetailsinfo;

import java.util.Scanner;

public class CafeDetailsInfo {

    public static void main(String[] args) {

        food FOOD = new food("Nasi lemak", 2.00, 3, "Traditional");
        food FOOD1 = new food("Fried Noodles", 3.00, 2, "Traditional");
        food FOOD2 = new food("Chicken Chop", 8.00, 4, "Western");

        drinks DRINKS = new drinks("Nescafe Ice", "Cold Drinks", 1.50, 2);
        drinks DRINKS1 = new drinks("Coffee", "Hot Drinks", 2.00, 1);
        drinks DRINKS2 = new drinks("Ice Lemon Tea", "Cold Drinks", 2.50, 3);

        snacks SNACKS = new snacks("Bread", 0.90, 5);
        snacks SNACKS1 = new snacks("Biscuits", 5.50, 2);
        snacks SNACKS2 = new snacks("Sweets", 5.50, 4);
        
        System.out.println("\n************************* CAFE DETAILS INFORMATION*************************");
        System.out.println("\nFood Name is: " + FOOD.getfoodName());
        System.out.println("The price is: RM " + FOOD.getfoodPrice());
        System.out.println("The Quantity of the food is: " + FOOD.getfoodQuantity());
        System.out.println("The Type of the food is: " + FOOD.getfoodType());

        System.out.println("\nFood Name is: " + FOOD1.getfoodName());
        System.out.println("The price is: RM " + FOOD1.getfoodPrice());
        System.out.println("The Quantity of the food is: " + FOOD1.getfoodQuantity());
        System.out.println("The Type of the food is: " + FOOD1.getfoodType());
        
        System.out.println("\nFood Name is: " + FOOD2.getfoodName());
        System.out.println("The price is: RM " + FOOD2.getfoodPrice());
        System.out.println("The Quantity of the food is: " + FOOD2.getfoodQuantity());
        System.out.println("The Type of the food is: " + FOOD2.getfoodType());

        System.out.println("\nDrinks Name is: " + DRINKS.getdrinksName());
        System.out.println("The price is: RM " + DRINKS.getdrinksPrice());
        System.out.println("The Quantity of the drinks is: " + DRINKS.getdrinksQuantity());
        System.out.println("the Type of the drinks is: " + DRINKS.getdrinksType());

        System.out.println("\nDrinks Name is: " + DRINKS1.getdrinksName());
        System.out.println("The price is: RM " + DRINKS1.getdrinksPrice());
        System.out.println("The Quantity of the drinks is: " + DRINKS1.getdrinksQuantity());
        System.out.println("the Type of the drinks is: " + DRINKS1.getdrinksType());
        
        System.out.println("\nDrinks Name is: " + DRINKS2.getdrinksName());
        System.out.println("The price is: RM " + DRINKS2.getdrinksPrice());
        System.out.println("The Quantity of the drinks is: " + DRINKS2.getdrinksQuantity());
        System.out.println("the Type of the drinks is: " + DRINKS2.getdrinksType());

        System.out.println("\nSnacks Name is: " + SNACKS.getsnacksName());
        System.out.println("The price is: RM " + SNACKS.getsnacksPrice());
        System.out.println("The Quantity of the snacks is: " + SNACKS.getsnacksQuantity());

        System.out.println("\nSnacks Name is: " + SNACKS1.getsnacksName());
        System.out.println("The price is: RM " + SNACKS1.getsnacksPrice());
        System.out.println("The Quantity of the snacks is: " + SNACKS1.getsnacksQuantity());
        
        System.out.println("\nSnacks Name is: " + SNACKS2.getsnacksName());
        System.out.println("The price is: RM " + SNACKS2.getsnacksPrice());
        System.out.println("The Quantity of the snacks is: " + SNACKS2.getsnacksQuantity());

    }

}
