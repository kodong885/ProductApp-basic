package kodong.study.BackEndTmp.infrastructure;

import ch.qos.logback.core.read.ListAppender;
import kodong.study.BackEndTmp.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private static List<Product> productList = new ArrayList<>();

    private ProductList() {};

    public static List<Product> getProductList() {
        return productList;
    }

}
