package per.jeremy.designpattern.abstractFactory.common;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access插入了一个department对象");
    }
}
