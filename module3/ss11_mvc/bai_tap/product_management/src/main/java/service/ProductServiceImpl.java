package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{
    private List<Product> products = new ArrayList<>();

    public ProductServiceImpl() {
        products.add(new Product(1, "Samsung S21", 888, "Samsung galaxy S21 ultra 128GB", "Samsung"));
        products.add(new Product(2, "iPhone 13", 999, "iPhone 13 Pro Max 128GB", "iPhone"));
        products.add(new Product(3, "Oppo Find X3", 777, "OPPO Find X3 Pro 5G", "OPPO"));
        products.add(new Product(4, "Xiaomi 11T", 666, "Xiaomi 11T Pro 256GB", "Xiaomi"));
        products.add(new Product(5, "Vivo V23e", 555, "Vivo V23e 128GB", "Vivo"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (product.getId() > 0) {
            //update
            int index = products.indexOf(product);
            products.set(index, product);
        }
        else {
            //add
            products.add(product);
        }
    }

    @Override
    public void delete(int id) {
        //C1
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getId() == id) {
//                products.remove(i);
//                break;
//            }
//        }

        //C2
        products.removeIf(f-> f.getId() == id);
    }

    @Override
    public List<Product> search(String name) {
        //C1
//        List<Product> result = new ArrayList<>();
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getName().contains(name)) {
//                result.add(products.get(i));
//            }
//        }
//        return result;

        //C2
        return products.stream().filter(f-> f.getName().contains(name)).collect(Collectors.toList());
    }
}
