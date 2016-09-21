package per.jeremy.designpattern.simplefactory;

/**
 * The type Operation add.
 */
public class OperationAdd extends Operation {

    public double getResult() {
        return getNumA() + getNumB();
    }

}
