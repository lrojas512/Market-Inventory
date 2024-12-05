import java.util.Scanner;

public class StockItem {

    private final String description;

    private int id;

    private static int nextIdNumber = 0;

    private double price;

    private int quantity;

    public StockItem() {

        description = "";

        id =0;

        price = 0.0;

        quantity = 0;

        id = nextIdNumber;

        nextIdNumber++;

    }

    public StockItem(String newDescription, double newPrice, int newQuantity) {

        description = newDescription;

        price = newPrice;

        quantity = newQuantity;

        id = nextIdNumber;

        nextIdNumber+=1;

    }
    public String getDescription() {

        return description;

    }

    public int getId() {


        return id;

    }

    public double getPrice() {

        return price;

    }

    public int getQuantity() {

        return quantity;

    }

    public void setPrice(double newPrice) {

        if (price > 0) {

            price = newPrice;

        }

        else System.out.print("Error");

    }
    public void setLowerQuantity(int newLowerQuantity) {

        quantity -= newLowerQuantity;
        if (quantity<0) {

            System.out.print("Error");

        }
    }
    public void setRaiseQuantity(int newRaiseQuantity) {

        quantity += newRaiseQuantity;

    }

    public String toString() {

        return ": Item number: " + id + " is " + description + " has price " + price + " we currently have "

                + quantity + " in stock";
    }

public static class Lab2 {

    public static void displayMenu() {


        System.out.print("1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit\n");

    }
    public static void main (String[] args) {


        Scanner myScan = new Scanner(System.in);

        StockItem stockItem1 = new StockItem("1 Gallon of Milk", 3.60, 15);

        StockItem stockItem2 = new StockItem("1 Loaf of bread" , 1.98, 30 );

        int userInput;

        double newPriceMilk;

        double newPriceBread;

        int newMilkQuant;

        int newBreadQuant;

        do{

            displayMenu();

            userInput = myScan.nextInt();

            switch(userInput) {

                case 1:

                    stockItem1.setLowerQuantity(1);

                    System.out.println();

                    break;

                case 2:

                    stockItem2.setLowerQuantity(1);

                    System.out.println();

                    break;

                case 3:

                    System.out.println("What is the new price for Milk?");

                    newPriceMilk = myScan.nextDouble();

                    stockItem1.setPrice(newPriceMilk);

                    System.out.println();

                    break;

                case 4:

                    System.out.println("What is the new price for Bread?");

                    newPriceBread = myScan.nextDouble();

                    stockItem2.setPrice(newPriceBread);

                    System.out.println();

                    break;

                case 5:

                    System.out.println("How much milk did we get?");

                    newMilkQuant = myScan.nextInt();

                    stockItem1.setRaiseQuantity(newMilkQuant);

                    System.out.println();

                    break;

                case 6:

                    System.out.println("How much bread did we get?");

                    newBreadQuant = myScan.nextInt();

                    stockItem2.setRaiseQuantity(newBreadQuant);

                    System.out.println();

                    break;

                case 7:

                    System.out.println("Milk " + stockItem1);

                    System.out.println("Bread " + stockItem2);

                    System.out.println();

                    break;

            }
        }while(userInput != 8);
    }
}}
