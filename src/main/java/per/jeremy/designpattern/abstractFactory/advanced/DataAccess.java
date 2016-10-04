package per.jeremy.designpattern.abstractFactory.advanced;

import per.jeremy.designpattern.abstractFactory.common.*;

/**
 * 用简单工厂模式
 * 省去了IFactory,SqlServerFactory,AccessFactory
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/4/16
 */
public class DataAccess {

    public static final String db = "sqlserver";

    public static IUser createUser() {
        IUser iUser = null;
        switch (db) {
            case "sqlserver":
                iUser = new SqlServerUser();
                break;
            case "access":
                iUser = new AccessUser();
                break;
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        IDepartment iDepartment = null;
        switch (db) {
            case "sqlserver":
                iDepartment = new SqlServerDepartment();
                break;
            case "access":
                iDepartment = new AccessDepartment();
                break;
        }
        return iDepartment;
    }

}
