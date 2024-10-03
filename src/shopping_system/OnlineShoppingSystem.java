package shopping_system;

public class OnlineShoppingSystem {
    Cart cart;
    private PaymentGateway paymentGateway;

    public OnlineShoppingSystem() {
        this.cart = new Cart();
        this.paymentGateway = new PaymentGateway();
    }

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        cart.removeProduct(product);
    }

    public Order checkout(String customerName, String address) {
        return new Order(cart, customerName, address);
    }

    public boolean processPayment(Order order, double amount) {
        return paymentGateway.processPayment(order, amount);
    }
}