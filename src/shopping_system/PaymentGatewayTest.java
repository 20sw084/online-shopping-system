package shopping_system;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class PaymentGatewayTest {
    private PaymentGateway paymentGateway;
    private Cart cart;
    private Product product1;
    private Order order;

    @Before
    public void setup() {
        paymentGateway = new PaymentGateway();
        cart = new Cart();
        product1 = new Product("1", "Product 1", 10.99);
        cart.addProduct(product1);
        order = new Order(cart, "John Doe", "123 Main St");
    }

    @Test
    public void testProcessPaymentSuccess() {
        assertTrue(paymentGateway.processPayment(order, 10.99));
    }

    @Test
    public void testProcessPaymentFailure() {
        assertFalse(paymentGateway.processPayment(order, 5.00));
    }
}