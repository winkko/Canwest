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
public class Efficacy implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer effId;

    private String effEffectClassification;

    private String effCretatename;

    private Date effCreatetime;

    private String effUpdname;

    private Date create;

    public Integer getEffId() {
        return effId;
    }

    public void setEffId(Integer effId) {
        this.effId = effId;
    }

    public String getEffEffectClassification() {
        return effEffectClassification;
    }

    public void setEffEffectClassification(String effEffectClassification) {
        this.effEffectClassification = effEffectClassification;
    }

    public String getEffCretatename() {
        return effCretatename;
    }

    public void setEffCretatename(String effCretatename) {
        this.effCretatename = effCretatename;
    }

    public Date getEffCreatetime() {
        return effCreatetime;
    }

    public void setEffCreatetime(Date effCreatetime) {
        this.effCreatetime = effCreatetime;
    }

    public String getEffUpdname() {
        return effUpdname;
    }

    public void setEffUpdname(String effUpdname) {
        this.effUpdname = effUpdname;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
