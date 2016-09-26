package per.jeremy.designpattern.test.facotory;

import junit.framework.TestCase;
import per.jeremy.designpattern.factory.IFactory;
import per.jeremy.designpattern.factory.LeiFeng;
import per.jeremy.designpattern.factory.UndergraduateFactory;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/26/16
 */
public class FactoryTest extends TestCase {

    public void test() {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.sweep();
        student.wash();
        student.buyRice();
    }

}
