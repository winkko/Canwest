package cn.lucky.pojo;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2020-07-23
 */
public class Patien implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer patId;

    private String patName;

    private Integer patAge;

    private String patSex;

    private String patPhone;

    public Integer getPatId() {
        return patId;
    }

    public void setPatId(Integer patId) {
        this.patId = patId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public Integer getPatAge() {
        return patAge;
    }

    public void setPatAge(Integer patAge) {
        this.patAge = patAge;
    }

    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    public String getPatPhone() {
        return patPhone;
    }

    public void setPatPhone(String patPhone) {
        this.patPhone = patPhone;
    }
}
