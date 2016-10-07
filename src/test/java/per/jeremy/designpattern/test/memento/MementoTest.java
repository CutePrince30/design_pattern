package per.jeremy.designpattern.test.memento;

import junit.framework.TestCase;
import per.jeremy.designpattern.memento.GameRole;
import per.jeremy.designpattern.memento.RoleStateCaretaker;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/7/16
 */
public class MementoTest extends TestCase {

    public void test() throws Exception {
        GameRole naruto = new GameRole();
        naruto.initState();
        naruto.displayState();

        naruto.fight();
        naruto.displayState();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(naruto.saveState());

        naruto.fight();
        naruto.displayState();

        System.out.println("not good for this round, play again.");
        naruto.recoveryState(caretaker.getMemento());
        naruto.displayState();
    }
}