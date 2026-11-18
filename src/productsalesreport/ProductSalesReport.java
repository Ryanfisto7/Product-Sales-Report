/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productsalesreport;
/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ProductSalesReport {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] products = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
            };
            
            String[] shortNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
            };
            
            int[][] sales = new int[3][3];
            
            for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                    sales[i][j] = scanner.nextInt();
                }
                System.out.println(); 
            }

            Product productReport = new Product(shortNames, sales);
            PrintProduct printer = new PrintProduct(productReport);
            printer.printReport();
        }
    }
}
