package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class EveningState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        }
        else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点 要加班了，有点累哦T^T");
            }
            else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
