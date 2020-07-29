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
public class Diagnosis implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer patId;

    private String depName;

    private String patName;

    private String diaSex;

    private Integer diaAge;

    private String diaDescribe;

    private String diaRp;

    private Date diaDate;

    private String docName;

    public Integer getPatId() {
        return patId;
    }

    public void setPatId(Integer patId) {
        this.patId = patId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getDiaSex() {
        return diaSex;
    }

    public void setDiaSex(String diaSex) {
        this.diaSex = diaSex;
    }

    public Integer getDiaAge() {
        return diaAge;
    }

    public void setDiaAge(Integer diaAge) {
        this.diaAge = diaAge;
    }

    public String getDiaDescribe() {
        return diaDescribe;
    }

    public void setDiaDescribe(String diaDescribe) {
        this.diaDescribe = diaDescribe;
    }

    public String getDiaRp() {
        return diaRp;
    }

    public void setDiaRp(String diaRp) {
        this.diaRp = diaRp;
    }

    public Date getDiaDate() {
        return diaDate;
    }

    public void setDiaDate(Date diaDate) {
        this.diaDate = diaDate;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
}
