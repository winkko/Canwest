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
public class Doctor implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer docId;

    private String docName;

    private Integer docAge;

    private String docSex;

    private String docIdcard;

    private String docPhone;

    private String docStatus;

    private Integer depId;

    private String docPosition;

    private Integer outId;

    private String docGood;

    private String docCreatename;

    private Date docAdmissiontime;

    private String docUpdname;

    private Date docUpdtime;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
        this.docAge = docAge;
    }

    public String getDocSex() {
        return docSex;
    }

    public void setDocSex(String docSex) {
        this.docSex = docSex;
    }

    public String getDocIdcard() {
        return docIdcard;
    }

    public void setDocIdcard(String docIdcard) {
        this.docIdcard = docIdcard;
    }

    public String getDocPhone() {
        return docPhone;
    }

    public void setDocPhone(String docPhone) {
        this.docPhone = docPhone;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDocPosition() {
        return docPosition;
    }

    public void setDocPosition(String docPosition) {
        this.docPosition = docPosition;
    }

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public String getDocGood() {
        return docGood;
    }

    public void setDocGood(String docGood) {
        this.docGood = docGood;
    }

    public String getDocCreatename() {
        return docCreatename;
    }

    public void setDocCreatename(String docCreatename) {
        this.docCreatename = docCreatename;
    }

    public Date getDocAdmissiontime() {
        return docAdmissiontime;
    }

    public void setDocAdmissiontime(Date docAdmissiontime) {
        this.docAdmissiontime = docAdmissiontime;
    }

    public String getDocUpdname() {
        return docUpdname;
    }

    public void setDocUpdname(String docUpdname) {
        this.docUpdname = docUpdname;
    }

    public Date getDocUpdtime() {
        return docUpdtime;
    }

    public void setDocUpdtime(Date docUpdtime) {
        this.docUpdtime = docUpdtime;
    }
}
