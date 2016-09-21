package per.jeremy.designpattern.strategy;

/**
 * 满额折现
 */
public class CashReturn extends CashSuper {

    private double moneyCondition; // 额度
    private double moneyReturn; // 折现值

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyReturn) * moneyReturn;
        }
        return result;
    }

}
