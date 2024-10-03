package shopping_system;

public class PaymentGateway {
    public boolean processPayment(Order order, double amount) {
        // Simulate payment processing
        return amount == order.calculateTotal();
    }
}
