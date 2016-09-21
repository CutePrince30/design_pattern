package per.jeremy.designpattern.simplefactory;

/**
 * Created by sunyunjie on 9/20/16.
 */
public abstract class Operation {

    protected double numA;
    protected double numB;

    public abstract double getResult();

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
