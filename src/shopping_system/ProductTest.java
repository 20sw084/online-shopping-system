package shopping_system;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class ProductTest {
    private Product product;

    @Before
    public void setup() {
        product = new Product("1", "Product 1", 10.99);
    }

    @Test
    public void testGetId() {
        assertEquals("1", product.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Product 1", product.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(10.99, product.getPrice(), 0.01);
    }
}