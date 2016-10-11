package per.jeremy.designpattern.iterator;

import java.util.List;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/11/16
 */
public class Conductor {

    private Bus bus;

    private int current = 0;

    public Conductor(Bus bus) {
        this.bus = bus;
    }

    public String first() {
        List<String> customers = bus.getCustomers();
        if (customers.size() > 0) {
            return customers.get(0);
        }
        return null;
    }

    public Object next() {
        String ret = null;
        current++;
        if (current < bus.getCustomers().size()) {
            ret = bus.getCustomers().get(current);
        }
        return ret;
    }

    public boolean isDone() {
        return current >= bus.getCustomers().size();
    }

    public String currentItem() {
        return bus.getCustomers().get(current);
    }

}
