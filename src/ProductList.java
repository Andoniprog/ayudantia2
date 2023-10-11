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

    public Product get(int index) {
        return products[index];
    }

    public boolean deleteById(int idProducto) {
        for (int i = 0; i < quantityProduct; i++) {
            if (products[i].getId() == idProducto) {
                products[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean existByName(String name) {
        for(int i = 0; i < quantityProduct; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
