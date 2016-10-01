package per.jeremy.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Product.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /1/16
 */
public class Product {

    /**
     * The Parts.
     */
    List<String> parts = new ArrayList<>();

    /**
     * Add a part of product
     *
     * @param part the part
     */
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建-----");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
