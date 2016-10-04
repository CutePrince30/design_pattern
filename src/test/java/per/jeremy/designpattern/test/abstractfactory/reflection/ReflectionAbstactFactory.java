package per.jeremy.designpattern.test.abstractfactory.reflection;

import junit.framework.TestCase;
import per.jeremy.designpattern.abstractFactory.advanced.DataAccess;
import per.jeremy.designpattern.abstractFactory.common.IUser;
import per.jeremy.designpattern.abstractFactory.common.User;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class ReflectionAbstactFactory extends TestCase {

    public void test() {
        User user = new User("Hi");

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
    }

}
