package demo1;


import java.util.Scanner;

public class Product {
    private int id;
    private String productName;
    private int qty;
    private double price;

    public int getQty() {
        return qty;
    }
    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public void checkQty() {
        if (qty > 0) {
            System.out.println("Sản phẩm còn hàng");
        } else {
            System.out.println("Sản phẩm hết hàng");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
