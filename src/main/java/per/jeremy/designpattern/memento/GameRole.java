package per.jeremy.designpattern.memento;

/**
 * The type Game role.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /7/16
 */
public class GameRole {

    // 生命
    private int vit;
    // 攻击
    private int atk;
    // 防御
    private int def;

    /**
     * Init state.
     */
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * Display state.
     */
    public void displayState() {
        System.out.println("生命力: " + getVit());
        System.out.println("攻击力: " + getAtk());
        System.out.println("防御力: " + getDef());
    }

    /**
     * Fight.
     */
    public void fight() {
        System.out.println("与boss战斗...");
        setAtk(this.atk - 10);
        setDef(this.def - 20);
        setVit(this.vit - 25);
    }

    /**
     * Save state role state memento.
     *
     * @return the role state memento
     */
    public RoleStateMemento saveState() {
        System.out.println("保存进度...");
        return new RoleStateMemento(getVit(), getAtk(), getDef());
    }

    /**
     * Recovery state.
     *
     * @param memento the memento
     */
    public void recoveryState(RoleStateMemento memento) {
        System.out.println("恢复进度...");
        setVit(memento.getVit());
        setAtk(memento.getAtk());
        setDef(memento.getDef());
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
