package per.jeremy.designpattern.simplefactory;

/**
 * The type Operation sub.
 */
public class OperationSub extends Operation {

    public double getResult() {
        return getNumA() - getNumB();
    }

}
