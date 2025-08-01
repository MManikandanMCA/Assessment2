package assessment2;

import java.util.Scanner;

class Product {  
    int pid;
    int price;
    int quantity;

    Product(int pid, int price, int quantity) {  //parameter constructor
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ProductMain {

    // Method to calculate total amount spent
    public static int calculateTotalAmount(Product[] products) {
        int total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] obj = new Product[5];

        // Accepting 5 products from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the product id: ");
            int productid = input.nextInt();

            System.out.println("Enter the product price: ");
            int productprice = input.nextInt();

            System.out.println("Enter the product quantity: ");
            int productquantity = input.nextInt();

            obj[i] = new Product(productid, productprice, productquantity);
        }

        // Finding PID of product with highest price
        int highestPrice = obj[0].price;
        int highestId = obj[0].pid;

        for (int i = 1; i < obj.length; i++) {
            if (obj[i].price > highestPrice) {
                highestPrice = obj[i].price;
                highestId = obj[i].pid;
            }
        }

        System.out.println("\nProduct with the highest price has PID: " + highestId);

        // Calculating total amount spent
        int totalSpent = calculateTotalAmount(obj);
        System.out.println("Total amount spent on all products: " + totalSpent);

        input.close();
    }
}
