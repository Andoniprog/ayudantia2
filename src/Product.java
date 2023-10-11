public class Product {
    private int id;
    private String name;

    private  float price;

    private boolean isDiscount;

    private ProductType tipo;

    public Product(int id, String name, float price, boolean isDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
