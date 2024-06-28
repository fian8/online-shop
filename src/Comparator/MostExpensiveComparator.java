package Comparator;
import Data.Product;
import java.util.*;

public class MostExpensiveComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() < p2.getPrice())
            return 1;
        if (p1.getPrice() > p2.getPrice())
            return -1;
        return 0;
    }
}


