package per.jeremy.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/8/16
 */
public class Composite extends Component {
    /**
     * Instantiates a new Component.
     *
     * @param name the name
     */
    public Composite(String name) {
        super(name);
    }

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);

        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
