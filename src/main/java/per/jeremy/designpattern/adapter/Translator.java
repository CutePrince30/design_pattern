package per.jeremy.designpattern.adapter;

/**
 * The type Translator.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /6/16
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Translator(String name) {
        super(name);
        foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.offense();
    }
}
