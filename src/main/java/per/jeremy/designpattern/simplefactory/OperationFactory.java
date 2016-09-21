package per.jeremy.designpattern.simplefactory;

/**
 * Created by sunyunjie on 9/20/16.
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        if (operate == null) {
            return null;
        }
        Operation operation = null;

        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }

        return operation;
    }

}
