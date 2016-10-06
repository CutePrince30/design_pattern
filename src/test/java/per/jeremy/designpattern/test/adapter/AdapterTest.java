package per.jeremy.designpattern.test.adapter;

import junit.framework.TestCase;
import per.jeremy.designpattern.adapter.Guard;
import per.jeremy.designpattern.adapter.Player;
import per.jeremy.designpattern.adapter.Translator;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/6/16
 */
public class AdapterTest extends TestCase {

    public void test() throws Exception {
        Player macgrady = new Guard("Tracy McGrady");
        Player yao = new Translator("姚明");

        macgrady.attack();
        macgrady.attack();

        yao.defense();
    }
}
