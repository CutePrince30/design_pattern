package per.jeremy.designpattern.test.facade;

import junit.framework.TestCase;
import per.jeremy.designpattern.facade.Facade;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/30/16
 */
public class FacadeTest extends TestCase {

    public void test() {
        Facade facade = new Facade();
        facade.groupA();
        facade.groupB();
    }

}
