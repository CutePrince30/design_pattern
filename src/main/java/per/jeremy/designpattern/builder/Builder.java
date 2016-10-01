package per.jeremy.designpattern.builder;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/1/16
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    Product getResult();

}
