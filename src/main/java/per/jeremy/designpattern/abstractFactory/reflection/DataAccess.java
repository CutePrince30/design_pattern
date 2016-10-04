package per.jeremy.designpattern.abstractFactory.reflection;

import per.jeremy.designpattern.abstractFactory.common.IDepartment;
import per.jeremy.designpattern.abstractFactory.common.IUser;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class DataAccess {

    public static final String class_path = "per.jeremy.designpattern.abstractFactory.common";
    public static final String db = "SqlServer";

    public static IUser createUser() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        IUser iUser = (IUser) Class.forName(class_path + "." + db + "User").newInstance();
        return iUser;
    }

    public static IDepartment createDepartment() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        IDepartment iDepartment = (IDepartment) Class.forName(class_path + "." + db + "Deparment").newInstance();
        return iDepartment;
    }

}
