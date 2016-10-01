package per.jeremy.designpattern.builder;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/1/16
 */
public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
