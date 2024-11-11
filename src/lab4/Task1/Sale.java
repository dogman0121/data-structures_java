package lab4.Task1;

public class Sale {
    public enum type{
        SALE10,
        SALE20,
        SALE30,
        SALE40,
        SALE50,
        SALE60,
        SALE70,
        SALE80,
        SALE90,
        SALE100,
    }

    private final Product product;
    private final type saleType;

    public Sale(Product product, type saleType){
        this.product = product;
        this.saleType = saleType;
    }

    public Product getProduct(){
        return product;
    }

    public type getSaleType(){
        return saleType;
    }
}
