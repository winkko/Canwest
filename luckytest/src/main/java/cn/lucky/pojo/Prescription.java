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
public class Prescription implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer patId;

    private String medName;

    private String medSepcification;

    private String preDose;

    private String preUsage;

    private String preFrequency;

    private String preExamine;

    private String preMedicine;

    public Integer getPatId() {
        return patId;
    }

    public void setPatId(Integer patId) {
        this.patId = patId;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedSepcification() {
        return medSepcification;
    }

    public void setMedSepcification(String medSepcification) {
        this.medSepcification = medSepcification;
    }

    public String getPreDose() {
        return preDose;
    }

    public void setPreDose(String preDose) {
        this.preDose = preDose;
    }

    public String getPreUsage() {
        return preUsage;
    }

    public void setPreUsage(String preUsage) {
        this.preUsage = preUsage;
    }

    public String getPreFrequency() {
        return preFrequency;
    }

    public void setPreFrequency(String preFrequency) {
        this.preFrequency = preFrequency;
    }

    public String getPreExamine() {
        return preExamine;
    }

    public void setPreExamine(String preExamine) {
        this.preExamine = preExamine;
    }

    public String getPreMedicine() {
        return preMedicine;
    }

    public void setPreMedicine(String preMedicine) {
        this.preMedicine = preMedicine;
    }
}
