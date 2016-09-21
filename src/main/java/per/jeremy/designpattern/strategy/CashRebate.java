package per.jeremy.designpattern.strategy;

/**
 * 打折
 */
public class CashRebate extends CashSuper {

    private double moneyRebate;

    /**
     * @param moneyRebate 折扣率
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
