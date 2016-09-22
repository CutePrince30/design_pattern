package per.jeremy.designpattern.proxy;

/**
 * The type Proxy.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /22/16
 */
public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    /**
     * Instantiates a new Proxy.
     *
     * @param girl the girl
     */
    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
