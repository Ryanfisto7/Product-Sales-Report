/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {

    private final IProduct productData;

    public PrintProduct(IProduct productData) {
        this.productData = productData;
    }

    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + productData.GetTotalProductsSold());
    }

    public void printAverageSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", productData.GetAverageProductSold());
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + productData.GetMostPopularProduct());
    }

    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
    }
}
