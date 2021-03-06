package per.jeremy.designpattern.test.prototype.shallow;

import junit.framework.TestCase;
import per.jeremy.designpattern.prototype.shallow.Resume;

/**
 * The type Shallow copy test.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 9 /27/16
 */
public class ShallowCopyTest extends TestCase {

    /**
     * Test.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public void test() throws CloneNotSupportedException {
        Resume resume = new Resume("大牛");
        resume.setPersonalInfo("man", "29");
        resume.setWorkExperience("2010-2012", "xx company");

        Resume a = (Resume) resume.clone();
        a.setWorkExperience("2013-2014", "yy company");

        Resume b = (Resume) resume.clone();
        b.setWorkExperience("2015-2016", "zz company");

        resume.display();
        a.display();
        b.display();
    }

}
