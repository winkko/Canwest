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
public class Drugtype implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer drugId;

    private String drugType;

    private String drugCretatename;

    private Date drugCreatetime;

    private String drugUpdname;

    private Date drugUpdtime;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugCretatename() {
        return drugCretatename;
    }

    public void setDrugCretatename(String drugCretatename) {
        this.drugCretatename = drugCretatename;
    }

    public Date getDrugCreatetime() {
        return drugCreatetime;
    }

    public void setDrugCreatetime(Date drugCreatetime) {
        this.drugCreatetime = drugCreatetime;
    }

    public String getDrugUpdname() {
        return drugUpdname;
    }

    public void setDrugUpdname(String drugUpdname) {
        this.drugUpdname = drugUpdname;
    }

    public Date getDrugUpdtime() {
        return drugUpdtime;
    }

    public void setDrugUpdtime(Date drugUpdtime) {
        this.drugUpdtime = drugUpdtime;
    }
}
