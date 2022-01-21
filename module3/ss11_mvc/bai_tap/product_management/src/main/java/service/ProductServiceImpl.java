package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;
    static  {
        products.put(1, new Product(1, "Samsung S21", 888, "Samsung galaxy S21 ultra 128GB", "Samsung"));
        products.put(2, new Product(2, "iPhone 13", 999, "iPhone 13 Pro Max 128GB", "iPhone"));
        products.put(3, new Product(3, "Oppo Find X3", 777, "OPPO Find X3 Pro 5G", "OPPO"));
        products.put(4, new Product(4, "Xiaomi 11T", 666, "Xiaomi 11T Pro 256GB", "Xiaomi"));
        products.put(5, new Product(5, "Vivo V23e", 555, "Vivo V23e 128GB", "Vivo"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                result.add(products.get(i));
            }
        }
        return result;
    }
}
