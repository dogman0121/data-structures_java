package lab4.Task1;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct("Tesla Model X", 12000.00);
        shop.addProduct("Tesla Model Y", 14000.00);
        shop.addProduct("Tesla Model Z", 15000.00);
        shop.addSale("Tesla Model Z", Sale.type.SALE50);
        shop.printCatalog();
        shop.removeSale("Tesla Model Z");
        shop.printCatalog();
        shop.register("aboba", "123456");
        shop.login("aboba", "123456");
        shop.addToCart("Tesla Model X");
        shop.printCart();
        shop.removeFromCart("Tesla Model X");
        shop.printCart();
    }
}
