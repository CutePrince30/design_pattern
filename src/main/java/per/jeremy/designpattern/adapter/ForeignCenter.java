package per.jeremy.designpattern.adapter;

/**
 * The type Center.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /6/16
 */
public class ForeignCenter {

    private String name;

    /**
     * Instantiates a new Foreign center.
     *
     * @param name the name
     */
    public ForeignCenter(String name) {
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

    /**
     * Attack.
     */
    public void attack() {
        System.out.println("外籍中锋 " + getName() + " 进攻");
    }

    /**
     * Offense.
     */
    public void offense() {
        System.out.println("外籍中锋 " + getName() + " 防守");
    }

}
