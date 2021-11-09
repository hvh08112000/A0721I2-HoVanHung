package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() == p2.getPrice()) {
            return p1.getName().compareTo(p2.getName());
        }
        return (int) (p1.getPrice() - p2.getPrice());
    }
}
