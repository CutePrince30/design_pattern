package per.jeremy.designpattern.composite;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/8/16
 */
public class LeafComponent extends Component {
    /**
     * Instantiates a new Component.
     *
     * @param name the name
     */
    public LeafComponent(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
    }
}
