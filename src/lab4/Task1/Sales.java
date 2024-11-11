package lab4.Task1;

import lab4.Task1.Sale.type;

public class Sales {
    public static double applySale(Product p, Database db) {
        Sale s = null;
        for(Sale sale: db.getSales())
            if (sale.getProduct().equals(p))
                s = sale;

        if (s == null)
            return p.getPrice();

        return switch (s.getSaleType()) {
            case type.SALE10 -> p.price - p.getPrice() * 0.10;
            case type.SALE20 -> p.price - p.getPrice() * 0.20;
            case type.SALE30 -> p.price - p.getPrice() * 0.30;
            case type.SALE40 -> p.price - p.getPrice() * 0.40;
            case type.SALE50 -> p.price - p.getPrice() * 0.50;
            case type.SALE60 -> p.price - p.getPrice() * 0.60;
            case type.SALE70 -> p.price - p.getPrice() * 0.70;
            case type.SALE80 -> p.price - p.getPrice() * 0.80;
            case type.SALE90 -> p.price - p.getPrice() * 0.90;
            case type.SALE100 -> 0;
        };
    }

    public void addSale(Sale s, Database db) {
        db.addSale(s);
    }

    public void removeSale(Sale s, Database db) {
        db.removeSale(s);
    }
}
