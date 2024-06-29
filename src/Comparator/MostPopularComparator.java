package Comparator;
import Data.Product;
import java.util.*;
public class MostPopularComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if (p1.getRate() < p2.getRate())
            return 1;
        if (p1.getRate() > p2.getRate())
            return -1;
        return 0;
    }
}
