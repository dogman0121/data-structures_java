package lab4.Task1;

import lab4.Task1.Exceptions.AuthenticationError;

import java.util.ArrayList;

public class Shop {
    private final Database db = new Database();
    private User currentUser = null;

    public void login(String username, String password) {
        for(User u : db.getUsers()){
            if (u.name.equals(username) && u.password.equals(password)) {
                currentUser = u;
            }
        }
    }

    public void register(String username, String password) {
        User user = new User(username, password);
        db.addUser(user);
    }

    public ArrayList<Product> getCatalog() {
        return db.getProducts();
    }

    public void addProduct(String productName, double price) {
        Product p = new Product(productName, price);
        db.addProduct(p);
    }

    public void removeProduct(String productName) {
        Product p = db.findProduct(productName);
        db.removeProduct(p);
    }

    public void addSale(String productName, Sale.type saleType) {
        Product p = db.findProduct(productName);
        Sale s = new Sale(p, saleType);
        db.addSale(s);
    }

    public void removeSale(String productName) {
        Sale s = db.findSale(productName);
        db.removeSale(s);
    }

    public void addToCart(String productName) {
        if (currentUser == null)
            throw new AuthenticationError("Ошибка аутентификации! Вы не вошли в аккаунт.");
        Product p = db.findProduct(productName);
        currentUser.addToCart(p);
    }

    public void removeFromCart(String productName) {
        if (currentUser == null)
            throw new AuthenticationError("Ошибка аутентификации! Вы не вошли в аккаунт.");
        Product p = db.findProduct(productName);
        currentUser.removeFromCart(p);
    }

    public void printCatalog() {
        System.out.format("%-32S%-16s\n", "Наименование товара", "Цена");
        for(Product p : db.getProducts()) {
            System.out.format("%-32S%-14.2f\n", p.name, Sales.applySale(p, db));
        }
    }

    public void printCart() {
        System.out.format("%-32S%-16s\n", "Наименование товара", "Цена");
        for(Product p : currentUser.getCart()) {
            System.out.format("%-32S%-14.2f\n", p.name, Sales.applySale(p, db));
        }
    }
}
