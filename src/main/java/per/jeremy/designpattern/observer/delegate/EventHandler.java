package per.jeremy.designpattern.observer.delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/3/16
 */
public class EventHandler {

    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        objects.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception {
        for (Event e : objects) {
            e.invoke();
        }
    }
}
