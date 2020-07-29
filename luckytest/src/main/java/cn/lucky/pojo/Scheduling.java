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
public class Scheduling implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer docId;

    private String schOpenaclinic;
    private Date schStarttime;

    private Date schEndtime;
    private Integer schNum;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getSchOpenaclinic() {
        return schOpenaclinic;
    }

    public void setSchOpenaclinic(String schOpenaclinic) {
        this.schOpenaclinic = schOpenaclinic;
    }

    public Date getSchStarttime() {
        return schStarttime;
    }

    public void setSchStarttime(Date schStarttime) {
        this.schStarttime = schStarttime;
    }

    public Date getSchEndtime() {
        return schEndtime;
    }

    public void setSchEndtime(Date schEndtime) {
        this.schEndtime = schEndtime;
    }

    public Integer getSchNum() {
        return schNum;
    }

    public void setSchNum(Integer schNum) {
        this.schNum = schNum;
    }
}
