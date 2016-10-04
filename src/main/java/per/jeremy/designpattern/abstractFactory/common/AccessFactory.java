package per.jeremy.designpattern.abstractFactory.common;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
