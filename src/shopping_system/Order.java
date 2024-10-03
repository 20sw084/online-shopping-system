package shopping_system;

public class Order {
    private Cart cart;
    private String customerName;
    private String address;

    public Order(Cart cart, String customerName, String address) {
        this.cart = cart;
        this.customerName = customerName;
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }
}