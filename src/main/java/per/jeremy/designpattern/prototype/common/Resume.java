package per.jeremy.designpattern.prototype.common;

/**
 * The type Resume.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /27/16
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    /**
     * Instantiates a new Resume.
     *
     * @param name the name
     */
    public Resume(String name) {
        this.name = name;
    }

    /**
     * Sets personal info.
     *
     * @param sex the sex
     * @param age the age
     */
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * Sets work experience.
     *
     * @param timeArea the time area
     * @param company  the company
     */
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * Display.
     */
    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历: " + timeArea + " " + company);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
