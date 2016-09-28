package per.jeremy.designpattern.prototype.shallow;

import per.jeremy.designpattern.prototype.common.WorkExperience;

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

    // 引用类型
    private WorkExperience workExperience;

    /**
     * Instantiates a new Resume.
     *
     * @param name the name
     */
    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
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
     * @param workDate the work date
     * @param company  the company
     */
    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    /**
     * Display.
     */
    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历: " + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
