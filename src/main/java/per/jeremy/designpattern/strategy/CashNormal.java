package per.jeremy.designpattern.strategy;

/**
 * 正常
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
