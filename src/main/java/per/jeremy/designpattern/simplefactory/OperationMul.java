package per.jeremy.designpattern.simplefactory;

/**
 * The type Operation mul.
 */
public class OperationMul extends Operation {

    public double getResult() {
        return getNumA() * getNumB();
    }

}
