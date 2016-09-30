package per.jeremy.designpattern.facade;

/**
 * The type System one.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /30/16
 */
public class SystemOne implements SubSystem {
    @Override
    public void call() {
        System.out.println("调用子系统1");
    }
}
