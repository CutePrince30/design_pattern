package per.jeremy.designpattern.abstractFactory.common;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("access插入了一个user对象");
    }
}
