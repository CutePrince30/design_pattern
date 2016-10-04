package per.jeremy.designpattern.abstractFactory.common;

/**
 * The type Department.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /4/16
 */
public class Department {

    private String name;

    /**
     * Instantiates a new Department.
     *
     * @param name the name
     */
    public Department(String name) {
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
