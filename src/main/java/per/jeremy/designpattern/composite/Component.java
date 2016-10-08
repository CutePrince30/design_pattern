package per.jeremy.designpattern.composite;

/**
 * The type Component.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /8/16
 */
public abstract class Component {

    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Component.
     *
     * @param name the name
     */
    public Component(String name) {
        this.name = name;
    }

    /**
     * Add.
     *
     * @param c the c
     */
    public abstract void add(Component c);

    /**
     * Remove.
     *
     * @param c the c
     */
    public abstract void remove(Component c);

    /**
     * Display.
     *
     * @param depth the depth
     */
    public abstract void display(int depth);

}
