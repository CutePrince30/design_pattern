package per.jeremy.designpattern.adapter;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/6/16
 */
public class Guard extends Player {
    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Guard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 " + getName() + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 " + getName() + " 防守");
    }
}
