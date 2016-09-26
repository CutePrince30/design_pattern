package per.jeremy.designpattern.factory;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/26/16
 */
public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}
