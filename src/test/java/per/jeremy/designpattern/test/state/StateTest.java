package per.jeremy.designpattern.test.state;

import junit.framework.TestCase;
import per.jeremy.designpattern.state.Work;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/5/16
 */
public class StateTest extends TestCase {

    public void test() {
        Work work = new Work();

        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);

        //work.setFinish(true);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setFinish(true);

        work.setHour(22);
        work.writeProgram();
    }

}
