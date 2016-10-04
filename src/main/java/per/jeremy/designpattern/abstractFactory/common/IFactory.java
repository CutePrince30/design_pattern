package per.jeremy.designpattern.abstractFactory.common;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();

}
