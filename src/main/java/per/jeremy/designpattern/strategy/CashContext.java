package per.jeremy.designpattern.strategy;

/**
 * The type Cash context.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /20/16
 */
public class CashContext {

    private CashSuper cs;

    /**
     * Instantiates a new Cash context.
     *
     * @param type the type
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cs = cashNormal;
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn(300, 100);
                cs = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate(0.8);
                cs = cashRebate;
                break;
        }
    }

    /**
     * Gets result.
     *
     * @param money the money
     * @return the result
     */
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}