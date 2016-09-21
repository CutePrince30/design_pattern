package per.jeremy.designpattern.test.strategy;

import junit.framework.TestCase;
import per.jeremy.designpattern.strategy.CashContext;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/20/16
 */
public class StrategyTest extends TestCase {

    public void test() {
        CashContext context = new CashContext("打8折");
        double result = context.getResult(800);
        System.out.println(result);
    }

}
