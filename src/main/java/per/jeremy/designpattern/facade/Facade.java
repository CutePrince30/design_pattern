package per.jeremy.designpattern.facade;

/**
 * The type Facade.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /30/16
 */
public class Facade {

    private SystemOne one;
    private SystemTwo two;
    private SystemThree three;

    /**
     * Instantiates a new Facade.
     */
    public Facade() {
        this.one = new SystemOne();
        this.two = new SystemTwo();
        this.three = new SystemThree();
    }

    /**
     * Group a.
     */
    public void groupA() {
        System.out.println("调用组合1");
        one.call();
        two.call();
    }

    /**
     * Group b.
     */
    public void groupB() {
        System.out.println("调用组合2");
        two.call();
        three.call();
    }

}
