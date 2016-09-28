package per.jeremy.designpattern.test.template;

import junit.framework.TestCase;
import per.jeremy.designpattern.template.TestPaper;
import per.jeremy.designpattern.template.TestPaperA;
import per.jeremy.designpattern.template.TestPaperB;

/**
 * The type Template test.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /28/16
 */
public class TemplateTest extends TestCase {

    /**
     * Test.
     */
    public void test() {
        System.out.println("学生A的考卷");
        TestPaper paperA = new TestPaperA();
        paperA.question1();
        paperA.question2();

        System.out.println("学生B的考卷");
        TestPaper paperB = new TestPaperB();
        paperB.question1();
        paperB.question2();
    }

}
