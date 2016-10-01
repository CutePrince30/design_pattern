package per.jeremy.designpattern.builder;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/1/16
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
