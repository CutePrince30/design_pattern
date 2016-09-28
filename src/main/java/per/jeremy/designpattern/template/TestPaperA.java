package per.jeremy.designpattern.template;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/28/16
 */
public class TestPaperA extends TestPaper {
    @Override
    protected String answer1() {
        return "2";
    }

    @Override
    protected String answer2() {
        return "4";
    }
}
