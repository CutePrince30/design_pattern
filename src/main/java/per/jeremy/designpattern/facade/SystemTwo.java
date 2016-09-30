package per.jeremy.designpattern.facade;

/**
 * The type System two.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /30/16
 */
public class SystemTwo implements SubSystem {
    @Override
    public void call() {
        System.out.println("调用子系统2");
    }
}
