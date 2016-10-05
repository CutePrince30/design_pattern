package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class SleepingState extends State {
    @Override
    void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 不行了，要睡着了zzz");
    }
}
