package per.jeremy.designpattern.abstractFactory.common;

/**
 * The type User.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /4/16
 */
public class User {

    private String name;

    /**
     * Instantiates a new User.
     *
     * @param name the name
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

}
