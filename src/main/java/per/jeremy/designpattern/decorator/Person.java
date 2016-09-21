package per.jeremy.designpattern.decorator;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/21/16
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    };

}
