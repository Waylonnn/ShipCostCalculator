import java.util.Scanner;

public class Main {
    /*Write a program where the user enters the price of an item and the program computes shipping costs.
    If the item price is $100 or more, then shipping is free otherwise it is 2% of the price.
    The program should output the shipping cost and the total price.*/
    public static void main(String[] args) {
        double itemCost;
        double shipCost;
        double total;
        System.out.print("Enter the price of your item: $");
        Scanner scan = new Scanner(System.in);
        itemCost = scan.nextDouble();
        if (itemCost < 100){
            shipCost = (itemCost * 0.02);
        }
        else {
            shipCost = 0;
        }
        total = itemCost + shipCost;
        System.out.println("Shipping Cost: $" + shipCost);
        System.out.print("Total Price: $" + total);
    }
}