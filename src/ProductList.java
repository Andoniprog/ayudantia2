public class ProductList {

    private int  quantityProduct;
    private int maxProducts;
    private Product[] products;

    public ProductList(int maxProducts){
        this.maxProducts = maxProducts;
        products = new Product[maxProducts];
        quantityProduct = 0;
    }
    public void add(Product product){
        products[quantityProduct]= product;
        quantityProduct++;
    }
    public void searchById(int id){

    }



}
