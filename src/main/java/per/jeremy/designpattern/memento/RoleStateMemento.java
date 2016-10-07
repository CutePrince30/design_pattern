package per.jeremy.designpattern.memento;

/**
 * The type Role state memento.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /7/16
 */
public class RoleStateMemento {

    private int vit;

    private int atk;

    private int def;

    /**
     * Instantiates a new Role state memento.
     *
     * @param vit the vit
     * @param atk the atk
     * @param def the def
     */
    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    /**
     * Gets vit.
     *
     * @return the vit
     */
    public int getVit() {
        return vit;
    }

    /**
     * Sets vit.
     *
     * @param vit the vit
     */
    public void setVit(int vit) {
        this.vit = vit;
    }

    /**
     * Gets atk.
     *
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Sets atk.
     *
     * @param atk the atk
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * Gets def.
     *
     * @return the def
     */
    public int getDef() {
        return def;
    }

    /**
     * Sets def.
     *
     * @param def the def
     */
    public void setDef(int def) {
        this.def = def;
    }

}
