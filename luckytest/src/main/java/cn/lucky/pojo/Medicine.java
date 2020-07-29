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
public class Medicine implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer medId;

    private Date medCreateTime;

    private String medDrugType;

    private String medEfficacy;

    private String medManufacturer;

    private String medName;

    private String medNum;

    private Integer medPrice;

    private String medSpecification;

    private String medUnit;

    private Integer medWholesalePrice;

    private Integer medStorage;

    private Date medProductionDate;

    private Date medQualityDate;

    private String medExamine;

    private Date medExaminetime;

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    public Date getMedCreateTime() {
        return medCreateTime;
    }

    public void setMedCreateTime(Date medCreateTime) {
        this.medCreateTime = medCreateTime;
    }

    public String getMedDrugType() {
        return medDrugType;
    }

    public void setMedDrugType(String medDrugType) {
        this.medDrugType = medDrugType;
    }

    public String getMedEfficacy() {
        return medEfficacy;
    }

    public void setMedEfficacy(String medEfficacy) {
        this.medEfficacy = medEfficacy;
    }

    public String getMedManufacturer() {
        return medManufacturer;
    }

    public void setMedManufacturer(String medManufacturer) {
        this.medManufacturer = medManufacturer;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedNum() {
        return medNum;
    }

    public void setMedNum(String medNum) {
        this.medNum = medNum;
    }

    public Integer getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(Integer medPrice) {
        this.medPrice = medPrice;
    }

    public String getMedSpecification() {
        return medSpecification;
    }

    public void setMedSpecification(String medSpecification) {
        this.medSpecification = medSpecification;
    }

    public String getMedUnit() {
        return medUnit;
    }

    public void setMedUnit(String medUnit) {
        this.medUnit = medUnit;
    }

    public Integer getMedWholesalePrice() {
        return medWholesalePrice;
    }

    public void setMedWholesalePrice(Integer medWholesalePrice) {
        this.medWholesalePrice = medWholesalePrice;
    }

    public Integer getMedStorage() {
        return medStorage;
    }

    public void setMedStorage(Integer medStorage) {
        this.medStorage = medStorage;
    }

    public Date getMedProductionDate() {
        return medProductionDate;
    }

    public void setMedProductionDate(Date medProductionDate) {
        this.medProductionDate = medProductionDate;
    }

    public Date getMedQualityDate() {
        return medQualityDate;
    }

    public void setMedQualityDate(Date medQualityDate) {
        this.medQualityDate = medQualityDate;
    }

    public String getMedExamine() {
        return medExamine;
    }

    public void setMedExamine(String medExamine) {
        this.medExamine = medExamine;
    }

    public Date getMedExaminetime() {
        return medExaminetime;
    }

    public void setMedExaminetime(Date medExaminetime) {
        this.medExaminetime = medExaminetime;
    }
}
