package per.jeremy.designpattern.test.simplefactory;

import junit.framework.TestCase;
import per.jeremy.designpattern.simplefactory.Operation;
import per.jeremy.designpattern.simplefactory.OperationFactory;

/**
 * Created by sunyunjie on 9/20/16.
 */
public class SimpleFactoryTest extends TestCase {

    public void testAdd() {
        Operation op = OperationFactory.createOperate("+");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
    }

    public void testSub() {
        Operation op = OperationFactory.createOperate("-");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
    }

    public void testMul() {
        Operation op = OperationFactory.createOperate("*");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
    }

    public void testDiv() {
        Operation op = OperationFactory.createOperate("/");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
    }

}
