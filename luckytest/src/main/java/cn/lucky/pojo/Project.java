package cn.lucky.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2020-07-23
 */
public class Project implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer proId;

    private String proName;

    private Integer depId;

    private String proCreatename;

    private Date proCretaetime;

    private String proUpdname;

    private Date proUpdtime;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getProCreatename() {
        return proCreatename;
    }

    public void setProCreatename(String proCreatename) {
        this.proCreatename = proCreatename;
    }

    public Date getProCretaetime() {
        return proCretaetime;
    }

    public void setProCretaetime(Date proCretaetime) {
        this.proCretaetime = proCretaetime;
    }

    public String getProUpdname() {
        return proUpdname;
    }

    public void setProUpdname(String proUpdname) {
        this.proUpdname = proUpdname;
    }

    public Date getProUpdtime() {
        return proUpdtime;
    }

    public void setProUpdtime(Date proUpdtime) {
        this.proUpdtime = proUpdtime;
    }
}
