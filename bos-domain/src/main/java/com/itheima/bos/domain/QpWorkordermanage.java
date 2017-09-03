package com.itheima.bos.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "qp_workordermanage", schema = "ssh", catalog = "")
public class QpWorkordermanage {
    private String id;
    private String arrivecity;
    private String product;
    private Integer num;
    private Double weight;
    private String floadreqr;
    private String prodtimelimit;
    private String prodtype;
    private String sendername;
    private String senderphone;
    private String senderaddr;
    private String receivername;
    private String receiverphone;
    private String receiveraddr;
    private Integer feeitemnum;
    private Double actlweit;
    private String vol;
    private String managerCheck;
    private Date updatetime;

    public QpWorkordermanage() {
    }

    public QpWorkordermanage(String id) {
        this.id = id;
    }

    public QpWorkordermanage(String id, String arrivecity, String product, Integer num, Double weight, String floadreqr, String prodtimelimit, String prodtype, String sendername, String senderphone, String senderaddr, String receivername, String receiverphone, String receiveraddr, Integer feeitemnum, Double actlweit, String vol, String managerCheck, Date updatetime) {
        this.id = id;
        this.arrivecity = arrivecity;
        this.product = product;
        this.num = num;
        this.weight = weight;
        this.floadreqr = floadreqr;
        this.prodtimelimit = prodtimelimit;
        this.prodtype = prodtype;
        this.sendername = sendername;
        this.senderphone = senderphone;
        this.senderaddr = senderaddr;
        this.receivername = receivername;
        this.receiverphone = receiverphone;
        this.receiveraddr = receiveraddr;
        this.feeitemnum = feeitemnum;
        this.actlweit = actlweit;
        this.vol = vol;
        this.managerCheck = managerCheck;
        this.updatetime = updatetime;
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "arrivecity")
    public String getArrivecity() {
        return arrivecity;
    }

    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity;
    }

    @Basic
    @Column(name = "product")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "floadreqr")
    public String getFloadreqr() {
        return floadreqr;
    }

    public void setFloadreqr(String floadreqr) {
        this.floadreqr = floadreqr;
    }

    @Basic
    @Column(name = "prodtimelimit")
    public String getProdtimelimit() {
        return prodtimelimit;
    }

    public void setProdtimelimit(String prodtimelimit) {
        this.prodtimelimit = prodtimelimit;
    }

    @Basic
    @Column(name = "prodtype")
    public String getProdtype() {
        return prodtype;
    }

    public void setProdtype(String prodtype) {
        this.prodtype = prodtype;
    }

    @Basic
    @Column(name = "sendername")
    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername;
    }

    @Basic
    @Column(name = "senderphone")
    public String getSenderphone() {
        return senderphone;
    }

    public void setSenderphone(String senderphone) {
        this.senderphone = senderphone;
    }

    @Basic
    @Column(name = "senderaddr")
    public String getSenderaddr() {
        return senderaddr;
    }

    public void setSenderaddr(String senderaddr) {
        this.senderaddr = senderaddr;
    }

    @Basic
    @Column(name = "receivername")
    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    @Basic
    @Column(name = "receiverphone")
    public String getReceiverphone() {
        return receiverphone;
    }

    public void setReceiverphone(String receiverphone) {
        this.receiverphone = receiverphone;
    }

    @Basic
    @Column(name = "receiveraddr")
    public String getReceiveraddr() {
        return receiveraddr;
    }

    public void setReceiveraddr(String receiveraddr) {
        this.receiveraddr = receiveraddr;
    }

    @Basic
    @Column(name = "feeitemnum")
    public Integer getFeeitemnum() {
        return feeitemnum;
    }

    public void setFeeitemnum(Integer feeitemnum) {
        this.feeitemnum = feeitemnum;
    }

    @Basic
    @Column(name = "actlweit")
    public Double getActlweit() {
        return actlweit;
    }

    public void setActlweit(Double actlweit) {
        this.actlweit = actlweit;
    }

    @Basic
    @Column(name = "vol")
    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    @Basic
    @Column(name = "managerCheck")
    public String getManagerCheck() {
        return managerCheck;
    }

    public void setManagerCheck(String managerCheck) {
        this.managerCheck = managerCheck;
    }

    @Basic
    @Column(name = "updatetime")
    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QpWorkordermanage that = (QpWorkordermanage) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (arrivecity != null ? !arrivecity.equals(that.arrivecity) : that.arrivecity != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (floadreqr != null ? !floadreqr.equals(that.floadreqr) : that.floadreqr != null) return false;
        if (prodtimelimit != null ? !prodtimelimit.equals(that.prodtimelimit) : that.prodtimelimit != null)
            return false;
        if (prodtype != null ? !prodtype.equals(that.prodtype) : that.prodtype != null) return false;
        if (sendername != null ? !sendername.equals(that.sendername) : that.sendername != null) return false;
        if (senderphone != null ? !senderphone.equals(that.senderphone) : that.senderphone != null) return false;
        if (senderaddr != null ? !senderaddr.equals(that.senderaddr) : that.senderaddr != null) return false;
        if (receivername != null ? !receivername.equals(that.receivername) : that.receivername != null) return false;
        if (receiverphone != null ? !receiverphone.equals(that.receiverphone) : that.receiverphone != null)
            return false;
        if (receiveraddr != null ? !receiveraddr.equals(that.receiveraddr) : that.receiveraddr != null) return false;
        if (feeitemnum != null ? !feeitemnum.equals(that.feeitemnum) : that.feeitemnum != null) return false;
        if (actlweit != null ? !actlweit.equals(that.actlweit) : that.actlweit != null) return false;
        if (vol != null ? !vol.equals(that.vol) : that.vol != null) return false;
        if (managerCheck != null ? !managerCheck.equals(that.managerCheck) : that.managerCheck != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (arrivecity != null ? arrivecity.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (floadreqr != null ? floadreqr.hashCode() : 0);
        result = 31 * result + (prodtimelimit != null ? prodtimelimit.hashCode() : 0);
        result = 31 * result + (prodtype != null ? prodtype.hashCode() : 0);
        result = 31 * result + (sendername != null ? sendername.hashCode() : 0);
        result = 31 * result + (senderphone != null ? senderphone.hashCode() : 0);
        result = 31 * result + (senderaddr != null ? senderaddr.hashCode() : 0);
        result = 31 * result + (receivername != null ? receivername.hashCode() : 0);
        result = 31 * result + (receiverphone != null ? receiverphone.hashCode() : 0);
        result = 31 * result + (receiveraddr != null ? receiveraddr.hashCode() : 0);
        result = 31 * result + (feeitemnum != null ? feeitemnum.hashCode() : 0);
        result = 31 * result + (actlweit != null ? actlweit.hashCode() : 0);
        result = 31 * result + (vol != null ? vol.hashCode() : 0);
        result = 31 * result + (managerCheck != null ? managerCheck.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        return result;
    }
}
