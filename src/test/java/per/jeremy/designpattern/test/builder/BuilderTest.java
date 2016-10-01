package per.jeremy.designpattern.test.builder;

import junit.framework.TestCase;
import per.jeremy.designpattern.builder.*;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/1/16
 */
public class BuilderTest extends TestCase {

    public void test() {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product product1 = b1.getResult();
        product1.show();

        director.construct(b2);
        Product product2 = b1.getResult();
        product2.show();
    }

}
