package per.jeremy.designpattern.observer.delegate;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/3/16
 */
public class GoodNotifier extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人!");
        getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        try {
            this.getEventHandler().notifyX();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
