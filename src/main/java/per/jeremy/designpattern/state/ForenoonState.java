package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class ForenoonState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍");
        }
        else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
