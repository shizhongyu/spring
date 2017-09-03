package com.itheima.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "qp_noticebill", schema = "ssh", catalog = "")
public class QpNoticebill {
    private String id;
    private TUser user;
    private BcStaff staff;
    private String customerId;
    private String customerName;
    private String delegater;
    private String telephone;
    private String pickaddress;
    private String arrivecity;
    private String product;
    private Date pickdate;
    private Integer num;
    private Double weight;
    private String volume;
    private String remark;
    private String ordertype;
    private Set workbills = new HashSet();


    public static final String  ORDERTYPE_AUTO = "自动分单";
    public static final String  ORDERTYPE_MAN = "人工分单";

    public QpNoticebill() {
    }

    public QpNoticebill(String id) {
        this.id = id;
    }

    public QpNoticebill(String id, TUser user, BcStaff staff, String customerId, String customerName, String delegater, String telephone, String pickaddress, String arrivecity, String product, Date pickdate, Integer num, Double weight, String volume, String remark, String ordertype, Set workbills) {
        this.id = id;
        this.user = user;
        this.staff = staff;
        this.customerId = customerId;
        this.customerName = customerName;
        this.delegater = delegater;
        this.telephone = telephone;
        this.pickaddress = pickaddress;
        this.arrivecity = arrivecity;
        this.product = product;
        this.pickdate = pickdate;
        this.num = num;
        this.weight = weight;
        this.volume = volume;
        this.remark = remark;
        this.ordertype = ordertype;
        this.workbills = workbills;
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
    @Column(name = "customer_id")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "delegater")
    public String getDelegater() {
        return delegater;
    }

    public void setDelegater(String delegater) {
        this.delegater = delegater;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "pickaddress")
    public String getPickaddress() {
        return pickaddress;
    }

    public void setPickaddress(String pickaddress) {
        this.pickaddress = pickaddress;
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
    @Column(name = "pickdate")
    public Date getPickdate() {
        return pickdate;
    }

    public void setPickdate(Date pickdate) {
        this.pickdate = pickdate;
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
    @Column(name = "volume")
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "ordertype")
    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QpNoticebill that = (QpNoticebill) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (delegater != null ? !delegater.equals(that.delegater) : that.delegater != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (pickaddress != null ? !pickaddress.equals(that.pickaddress) : that.pickaddress != null) return false;
        if (arrivecity != null ? !arrivecity.equals(that.arrivecity) : that.arrivecity != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (pickdate != null ? !pickdate.equals(that.pickdate) : that.pickdate != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (ordertype != null ? !ordertype.equals(that.ordertype) : that.ordertype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (delegater != null ? delegater.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (pickaddress != null ? pickaddress.hashCode() : 0);
        result = 31 * result + (arrivecity != null ? arrivecity.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (pickdate != null ? pickdate.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (ordertype != null ? ordertype.hashCode() : 0);
        return result;
    }
}
