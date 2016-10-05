package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class NoonState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点 吃午饭，睡觉");
        }
        else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
