package per.jeremy.designpattern.prototype.deep;

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

    private Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

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

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(String age) {
        this.age = age;
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
        Resume obj = new Resume(this.workExperience);
        obj.setName(this.name);
        obj.setSex(this.sex);
        obj.setAge(this.age);
        return obj;
    }

}
