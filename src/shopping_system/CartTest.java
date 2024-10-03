package shopping_system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @Before
    public void setup() {
        cart = new Cart();
        product1 = new Product("1", "Product 1", 10.99);
        product2 = new Product("2", "Product 2", 5.99);
    }

    @Test
    public void testAddProduct() {
        cart.addProduct(product1);
        assertEquals(1, cart.getProducts().size());
    }

    @Test
    public void testRemoveProduct() {
        cart.addProduct(product1);
        cart.removeProduct(product1);
        assertEquals(0, cart.getProducts().size());
    }

    @Test
    public void testCalculateTotal() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(16.98, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testCalculateTotalEmptyCart() {
        assertEquals(0, cart.calculateTotal(), 0.01);
    }
}