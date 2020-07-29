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
public class Reserve implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer resId;
    private Integer patId;
    private String resGhtype;
    private Integer depId;
    private String depPath;
    private Integer proId;
    private Integer outId;
    private Integer docId;
    private Date resSubscribetime;
    private String resStatus;
    private Integer resPrice;
    private String resPayment;
    private Date resReservetime;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getPatId() {
        return patId;
    }

    public void setPatId(Integer patId) {
        this.patId = patId;
    }

    public String getResGhtype() {
        return resGhtype;
    }

    public void setResGhtype(String resGhtype) {
        this.resGhtype = resGhtype;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepPath() {
        return depPath;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Date getResSubscribetime() {
        return resSubscribetime;
    }

    public void setResSubscribetime(Date resSubscribetime) {
        this.resSubscribetime = resSubscribetime;
    }

    public String getResStatus() {
        return resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus;
    }

    public Integer getResPrice() {
        return resPrice;
    }

    public void setResPrice(Integer resPrice) {
        this.resPrice = resPrice;
    }

    public String getResPayment() {
        return resPayment;
    }

    public void setResPayment(String resPayment) {
        this.resPayment = resPayment;
    }

    public Date getResReservetime() {
        return resReservetime;
    }

    public void setResReservetime(Date resReservetime) {
        this.resReservetime = resReservetime;
    }
}
