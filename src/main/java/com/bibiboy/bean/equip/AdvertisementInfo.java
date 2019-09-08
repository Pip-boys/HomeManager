package com.bibiboy.bean.equip;

public class AdvertisementInfo {
    private Integer nId;

    private Integer nTop;

    private Integer nSort;

    private Integer nEquip;

    private String vcPic;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnTop() {
        return nTop;
    }

    public void setnTop(Integer nTop) {
        this.nTop = nTop;
    }

    public Integer getnSort() {
        return nSort;
    }

    public void setnSort(Integer nSort) {
        this.nSort = nSort;
    }

    public Integer getnEquip() {
        return nEquip;
    }

    public void setnEquip(Integer nEquip) {
        this.nEquip = nEquip;
    }

    public String getVcPic() {
        return vcPic;
    }

    public void setVcPic(String vcPic) {
        this.vcPic = vcPic == null ? null : vcPic.trim();
    }
}