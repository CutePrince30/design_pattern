package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class AfternoonState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点 下午上班状态还不错，继续加油*.*");
        }
        else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
