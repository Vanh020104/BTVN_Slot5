package demo1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(001, "Product 1", 20, 2000);
        Product product2 = new Product(002, "Product 2", 100, 5000);
        product1.checkQty();
        product2.checkQty();

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.setCity("HoChiMinh");
        cart.calculateTotal();
        System.out.println(cart.getGrandTotal());
    }
}

