package per.jeremy.designpattern.test.composite;

import junit.framework.TestCase;
import per.jeremy.designpattern.composite.Composite;
import per.jeremy.designpattern.composite.Leaf;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/8/16
 */
public class CompositeTest extends TestCase {

    public void test() throws Exception {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp1 = new Composite("composite X");
        comp1.add(new Leaf("Leaf XA"));
        comp1.add(new Leaf("Leaf XB"));

        root.add(comp1);

        Composite comp2 = new Composite("composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp1.add(comp2);

        root.display(1);
    }
}
