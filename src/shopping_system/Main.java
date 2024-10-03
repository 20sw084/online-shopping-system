package shopping_system;

public class Main {
    public static void main(String[] args) {
        OnlineShoppingSystem shoppingSystem = new OnlineShoppingSystem();
        
        // Create products
        Product product1 = new Product("1", "Product 1", 10.99);
        Product product2 = new Product("2", "Product 2", 5.99);
        
        // Add products to cart
        shoppingSystem.addProductToCart(product1);
        shoppingSystem.addProductToCart(product2);
        
        // Checkout
        Order order = shoppingSystem.checkout("John Doe", "123 Main St");
        
        // Process payment
        boolean paymentSuccess = shoppingSystem.processPayment(order, 16.98);
        
        System.out.println("Payment Success: " + paymentSuccess);
    }
}