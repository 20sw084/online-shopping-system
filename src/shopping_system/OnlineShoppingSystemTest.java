package shopping_system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlineShoppingSystemTest {
    private OnlineShoppingSystem shoppingSystem;
    private Product product1;
    private Product product2;

    @Before
    public void setup() {
        shoppingSystem = new OnlineShoppingSystem();
        product1 = new Product("1", "Product 1", 10.99);
        product2 = new Product("2", "Product 2", 5.99);
    }

    @Test
    public void testAddProductToCart() {
        shoppingSystem.addProductToCart(product1);
        assertEquals(1, shoppingSystem.cart.getProducts().size());
    }

    @Test
    public void testRemoveProductFromCart() {
        shoppingSystem.addProductToCart(product1);
        shoppingSystem.removeProductFromCart(product1);
        assertEquals(0, shoppingSystem.cart.getProducts().size());
    }

    @Test
    public void testCheckout() {
        shoppingSystem.addProductToCart(product1);
        shoppingSystem.addProductToCart(product2);
        Order order = shoppingSystem.checkout("John Doe", "123 Main St");
        assertEquals(2, order.getCart().getProducts().size());
        assertEquals(16.98, order.calculateTotal(), 0.01);
    }

    @Test
    public void testProcessPayment() {
        shoppingSystem.addProductToCart(product1);
        shoppingSystem.addProductToCart(product2);
        Order order = shoppingSystem.checkout("John Doe", "123 Main St");
        assertTrue(shoppingSystem.processPayment(order, 16.98));
    }

    @Test
    public void testProcessPaymentFailure() {
        shoppingSystem.addProductToCart(product1);
        shoppingSystem.addProductToCart(product2);
        Order order = shoppingSystem.checkout("John Doe", "123 Main St");
        assertFalse(shoppingSystem.processPayment(order, 15.00));
    }
}