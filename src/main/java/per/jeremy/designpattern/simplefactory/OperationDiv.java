package per.jeremy.designpattern.simplefactory;

/**
 * The type Operation div.
 */
public class OperationDiv extends Operation {

    public double getResult() {
        return getNumA() / getNumB();
    }

}
