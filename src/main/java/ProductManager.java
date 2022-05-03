public class ProductManager {
    public ProductRepositori repository;

    public ProductManager(ProductRepositori repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.addProduct(product);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }


    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                int leghth = result.length + 1;
                Product[] tmp = new Product[leghth];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = product;
                result = tmp;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}