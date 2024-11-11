package lab4.Task1;


import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Sale> sales = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public void removeSale(Sale sale) {
        sales.remove(sale);
    }

    public Sale findSale(String productName) {
        for (Sale sale : sales) {
            if(sale.getProduct().getName().equals(productName)) {
                return sale;
            }
        }
        return null;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
