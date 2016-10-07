package per.jeremy.designpattern.memento;

/**
 * The type Role state caretaker.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /7/16
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    /**
     * Gets memento.
     *
     * @return the memento
     */
    public RoleStateMemento getMemento() {
        return memento;
    }

    /**
     * Sets memento.
     *
     * @param memento the memento
     */
    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
