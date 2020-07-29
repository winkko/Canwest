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
public class Register implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer regId;

    private String regNumber;

    private String regName;

    private String regPassword;

    private String regRoletype;

    private String regStatus;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getRegPassword() {
        return regPassword;
    }

    public void setRegPassword(String regPassword) {
        this.regPassword = regPassword;
    }

    public String getRegRoletype() {
        return regRoletype;
    }

    public void setRegRoletype(String regRoletype) {
        this.regRoletype = regRoletype;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }
}
