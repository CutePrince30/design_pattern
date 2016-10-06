package per.jeremy.designpattern.adapter;

/**
 * The type Player.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /6/16
 */
public abstract class Player {

    private String name;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Attack.
     */
    public abstract void attack();

    /**
     * Defense.
     */
    public abstract void defense();

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
