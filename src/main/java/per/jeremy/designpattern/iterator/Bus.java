package per.jeremy.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/11/16
 */
public class Bus {

    private List<String> customers = new ArrayList<>();

    public Bus getOn(String name) {
        this.customers.add(name);
        return this;
    }

    public List<String> getCustomers() {
        return customers;
    }

}
