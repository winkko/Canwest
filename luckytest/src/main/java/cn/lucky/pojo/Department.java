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

public class Department implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer depId;

    private String depName;

    private String depPath;

    private String depCreatename;

    private Date depCratetime;

    private String depUpdname;

    private Date depUpdtime;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepPath() {
        return depPath;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public String getDepCreatename() {
        return depCreatename;
    }

    public void setDepCreatename(String depCreatename) {
        this.depCreatename = depCreatename;
    }

    public Date getDepCratetime() {
        return depCratetime;
    }

    public void setDepCratetime(Date depCratetime) {
        this.depCratetime = depCratetime;
    }

    public String getDepUpdname() {
        return depUpdname;
    }

    public void setDepUpdname(String depUpdname) {
        this.depUpdname = depUpdname;
    }

    public Date getDepUpdtime() {
        return depUpdtime;
    }

    public void setDepUpdtime(Date depUpdtime) {
        this.depUpdtime = depUpdtime;
    }
}
