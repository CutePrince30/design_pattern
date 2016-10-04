package per.jeremy.designpattern.test.abstractfactory.common;

import junit.framework.TestCase;
import per.jeremy.designpattern.abstractFactory.common.*;

/**
 * 用抽象工程模式来实现数据库的切换，但是其缺点在若再加一个实体，就要改很多代码，违反了依赖倒转原则（低耦合）
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /4/16
 */
public class CommonAbstractFactoryTest extends TestCase {

    /**
     * Test sql server.
     */
    public void testSqlServer() {
        IFactory iFactory = new SqlServerFactory();
        IUser iuser = iFactory.createUser();

        User user = new User("jeremy");
        iuser.insert(user);

        IDepartment iDepartment = iFactory.createDepartment();

        Department department = new Department("yahoo");
        iDepartment.insert(department);
    }

    /**
     * Test access.
     */
    public void testAccess() {
        IFactory iFactory = new AccessFactory();
        IUser iuser = iFactory.createUser();

        User user = new User("jeremy");
        iuser.insert(user);

        IDepartment iDepartment = iFactory.createDepartment();

        Department department = new Department("yahoo");
        iDepartment.insert(department);
    }

}
