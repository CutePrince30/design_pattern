package per.jeremy.designpattern.observer.delegate;

/**
 * The type Notifier.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /3/16
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    /**
     * 增加需要帮忙放哨的学生
     *
     * @param object     the object
     * @param methodName the method name
     * @param args       the args
     */
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * 通知要帮忙放哨的学生
     */
    public abstract void notifyX();

    /**
     * Gets event handler.
     *
     * @return the event handler
     */
    public EventHandler getEventHandler() {
        return eventHandler;
    }

    /**
     * Sets event handler.
     *
     * @param eventHandler the event handler
     */
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

}
