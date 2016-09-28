package per.jeremy.designpattern.template;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/28/16
 */
public abstract class TestPaper {

    public void question1() {
        System.out.println("1 + 1 = ?" + ": " + answer1());
    }

    protected abstract String answer1();

    public void question2() {
        System.out.println("2 + 2 = ?" + ": " + answer2());
    }

    protected abstract String answer2();

}
