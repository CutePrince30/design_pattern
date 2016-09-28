package per.jeremy.designpattern.prototype.common;

/**
 * 引用类型对象，shallow copy的时候是地址引用，deep cpoy的时候才是对象复制
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9/27/16
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
