package ss12_java_collection_framework.bai_tap;

import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        Product p1 = new Product(1, "Giay", 230000);
        Product p2 = new Product(2, "Ao", 220000);
        Product p3 = new Product(3, "Quan", 210000);
        Product p4 = new Product(4, "Giay", 200000);
        Product p5 = new Product(5, "Sach", 210000);
        Product p6 = new Product(6, "Vo", 190000);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);
        manager.addProduct(p5);
        manager.addProduct(p6);

        List<Product> products = manager.getProductList();
        manager.sortProductByPrice(products);
        products.stream().forEach(product -> System.out.println(product));
    }
}
