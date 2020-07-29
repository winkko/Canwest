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
public class Outpatienttype implements Serializable {

//private static final long serialVersionUID=1L;

    private Integer outId;

    private String outName;

    private Integer outPrice;

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }

    public Integer getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(Integer outPrice) {
        this.outPrice = outPrice;
    }
}
