package per.jeremy.designpattern.test.abstractfactory.advanced;

import junit.framework.TestCase;
import per.jeremy.designpattern.abstractFactory.advanced.DataAccess;
import per.jeremy.designpattern.abstractFactory.common.User;

/**
 * 这种方法减少了抽象工厂的使用，但是DataAccess中有switch case，同样的，如果再来一个对象，还需要继续填充switch逻辑
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class AdvancedAbstractFactoryTest extends TestCase {

    public void test() {
        User user = new User("jeremy");
        DataAccess.createUser().insert(user);
    }

}
