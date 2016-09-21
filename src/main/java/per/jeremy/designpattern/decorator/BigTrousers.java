package per.jeremy.designpattern.decorator;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/21/16
 */
public class BigTrousers extends Finery {

    @Override
    public void show() {
        System.out.println("大垮裤");
        super.show();
    }
}
