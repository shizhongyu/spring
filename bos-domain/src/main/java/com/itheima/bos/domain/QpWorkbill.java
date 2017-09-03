package com.itheima.bos.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "qp_workbill", schema = "ssh", catalog = "")
public class QpWorkbill {
    private String id;
    private QpNoticebill noticebill;
    private BcStaff staff;
    private String type;
    private String pickstate;
    private Timestamp buildtime;
    private Integer attachbilltimes;
    private String remark;

    public static final String  TYPE_1 = "新单";
    public static final String  TYPE_2 = "追单";
    public static final String  TYPE_3 = "改单";
    public static final String  TYPE_4 = "销单";

    public static final String  PICKSTATE_NO = "未取件";
    public static final String  PICKSTATE_RUNNING = "取件中";
    public static final String  PICKSTATE_YES = "已取件";


    public QpWorkbill() {
    }

    public QpWorkbill(String id, Timestamp buildtime) {
        this.id = id;
        this.buildtime = buildtime;
    }

    public QpWorkbill(String id, QpNoticebill noticebill, BcStaff staff, String type, String pickstate, Timestamp buildtime, Integer attachbilltimes, String remark) {
        this.id = id;
        this.noticebill = noticebill;
        this.staff = staff;
        this.type = type;
        this.pickstate = pickstate;
        this.buildtime = buildtime;
        this.attachbilltimes = attachbilltimes;
        this.remark = remark;
    }


    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QpNoticebill getNoticebill() {
        return noticebill;
    }

    public void setNoticebill(QpNoticebill noticebill) {
        this.noticebill = noticebill;
    }

    public BcStaff getStaff() {
        return staff;
    }

    public void setStaff(BcStaff staff) {
        this.staff = staff;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "pickstate")
    public String getPickstate() {
        return pickstate;
    }

    public void setPickstate(String pickstate) {
        this.pickstate = pickstate;
    }

    @Basic
    @Column(name = "buildtime")
    public Timestamp getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Timestamp buildtime) {
        this.buildtime = buildtime;
    }

    @Basic
    @Column(name = "attachbilltimes")
    public Integer getAttachbilltimes() {
        return attachbilltimes;
    }

    public void setAttachbilltimes(Integer attachbilltimes) {
        this.attachbilltimes = attachbilltimes;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QpWorkbill that = (QpWorkbill) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (pickstate != null ? !pickstate.equals(that.pickstate) : that.pickstate != null) return false;
        if (buildtime != null ? !buildtime.equals(that.buildtime) : that.buildtime != null) return false;
        if (attachbilltimes != null ? !attachbilltimes.equals(that.attachbilltimes) : that.attachbilltimes != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (pickstate != null ? pickstate.hashCode() : 0);
        result = 31 * result + (buildtime != null ? buildtime.hashCode() : 0);
        result = 31 * result + (attachbilltimes != null ? attachbilltimes.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
