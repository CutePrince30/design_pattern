package per.jeremy.designpattern.decorator;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/21/16
 */
public class Finery extends Person {

    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
    }

}
