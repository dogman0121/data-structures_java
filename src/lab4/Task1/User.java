package lab4.Task1;

import java.util.ArrayList;

public class User {
    final String name;
    final String password;
    private ArrayList<Product> cart = new ArrayList<>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "User[name=" + name + ", password=" + password + "]";
    }
}
