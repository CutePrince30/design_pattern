package per.jeremy.designpattern.proxy;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/22/16
 */
public class Pursuit implements IGiveGift {

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + " 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + " 送你玫瑰花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + " 送你巧克力");
    }
}
