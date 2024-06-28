package Comparator;
import Data.*;
import java.util.*;

public class CheapestComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() < p2.getPrice())
            return -1;
        if (p1.getPrice() > p2.getPrice())
            return 1;
        return 0;
    }
}
