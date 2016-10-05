package per.jeremy.designpattern.state;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class Work {

    private State current;

    private double hour;

    private boolean finish;

    public Work() {
        current = new ForenoonState();
    }

    public void setState(State state) {
        this.current = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
