/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    private final String[] products;
    private final int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int[] sale : sales) {
            count += sale.length;
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSale = sales[0][0];
        String popularProduct = products[0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > maxSale) {
                    maxSale = sales[i][j];
                    popularProduct = products[i];
                }
            }
        }
        return popularProduct + "(" + maxSale + ")";
    }
}
