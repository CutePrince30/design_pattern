package per.jeremy.designpattern.test.decorator;

import junit.framework.TestCase;
import per.jeremy.designpattern.decorator.BigTrousers;
import per.jeremy.designpattern.decorator.Person;
import per.jeremy.designpattern.decorator.TShirts;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/21/16
 */
public class DecoratorTest extends TestCase {

    public void test() {
        Person person = new Person("jay");

        TShirts tShirts = new TShirts();
        BigTrousers bigTrousers = new BigTrousers();

        tShirts.decorate(person);
        bigTrousers.decorate(tShirts);

        bigTrousers.show();
    }

}
