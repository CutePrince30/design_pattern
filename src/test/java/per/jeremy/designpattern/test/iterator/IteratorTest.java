package per.jeremy.designpattern.test.iterator;

import junit.framework.TestCase;
import per.jeremy.designpattern.iterator.Bus;
import per.jeremy.designpattern.iterator.Conductor;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/11/16
 */
public class IteratorTest extends TestCase {

    public void test() throws Exception {
        Bus bus = new Bus();
        bus.getOn("lili").getOn("limei").getOn("hanlei");

        Conductor conductor = new Conductor(bus);
        //conductor.first();
        while (!conductor.isDone()) {
            System.out.println(conductor.currentItem());
            conductor.next();
        }
    }

}
