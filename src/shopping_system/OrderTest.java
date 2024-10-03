package shopping_system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    private Order order;
    private Cart cart;
    private Product product1;
    private Product product2;

    @Before
    public void setup() {
        cart = new Cart();
        product1 = new Product("1", "Product 1", 10.99);
        product2 = new Product("2", "Product 2", 5.99);
        cart.addProduct(product1);
        cart.addProduct(product2);
        order = new Order(cart, "John Doe", "123 Main St");
    }

    @Test
    public void testGetCart() {
        assertEquals(cart, order.getCart());
    }

    @Test
    public void testGetCustomerName() {
        assertEquals("John Doe", order.getCustomerName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", order.getAddress());
    }

    @Test
    public void testCalculateTotal() {
        assertEquals(16.98, order.calculateTotal(), 0.01);
    }
}