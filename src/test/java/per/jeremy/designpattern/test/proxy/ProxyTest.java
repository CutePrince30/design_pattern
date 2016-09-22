package per.jeremy.designpattern.test.proxy;

import junit.framework.TestCase;
import per.jeremy.designpattern.proxy.Girl;
import per.jeremy.designpattern.proxy.Proxy;

/**
 * The type Proxy test.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /21/16
 */
public class ProxyTest extends TestCase {

    /**
     * Test.
     */
    public void test() {
        Girl girl = new Girl();
        girl.setName("撒拉");

        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

}
