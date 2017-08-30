package com.itheima.bos.domain;

import javax.persistence.*;

@Entity
@Table(name = "bc_subarea", schema = "ssh", catalog = "")
public class BcSubarea {
    private String id;
    private BcDecidedzone decidedzone;
    private BcRegion region;
    private String addresskey;
    private String startnum;
    private String endnum;
    private String single;
    private String position;

    public BcSubarea() {
    }

    public BcSubarea(String id, BcDecidedzone decidedzone, BcRegion region, String addresskey, String startnum, String endnum, String single, String position) {
        this.id = id;
        this.decidedzone = decidedzone;
        this.region = region;
        this.addresskey = addresskey;
        this.startnum = startnum;
        this.endnum = endnum;
        this.single = single;
        this.position = position;
    }

    public BcDecidedzone getDecidedzone() {
        return decidedzone;
    }

    public void setDecidedzone(BcDecidedzone decidedzone) {
        this.decidedzone = decidedzone;
    }

    public BcRegion getRegion() {
        return region;
    }

    public void setRegion(BcRegion region) {
        this.region = region;
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
    @Column(name = "addresskey")
    public String getAddresskey() {
        return addresskey;
    }

    public void setAddresskey(String addresskey) {
        this.addresskey = addresskey;
    }

    @Basic
    @Column(name = "startnum")
    public String getStartnum() {
        return startnum;
    }

    public void setStartnum(String startnum) {
        this.startnum = startnum;
    }

    @Basic
    @Column(name = "endnum")
    public String getEndnum() {
        return endnum;
    }

    public void setEndnum(String endnum) {
        this.endnum = endnum;
    }

    @Basic
    @Column(name = "single")
    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BcSubarea bcSubarea = (BcSubarea) o;

        if (id != null ? !id.equals(bcSubarea.id) : bcSubarea.id != null) return false;
        if (addresskey != null ? !addresskey.equals(bcSubarea.addresskey) : bcSubarea.addresskey != null) return false;
        if (startnum != null ? !startnum.equals(bcSubarea.startnum) : bcSubarea.startnum != null) return false;
        if (endnum != null ? !endnum.equals(bcSubarea.endnum) : bcSubarea.endnum != null) return false;
        if (single != null ? !single.equals(bcSubarea.single) : bcSubarea.single != null) return false;
        return position != null ? position.equals(bcSubarea.position) : bcSubarea.position == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (addresskey != null ? addresskey.hashCode() : 0);
        result = 31 * result + (startnum != null ? startnum.hashCode() : 0);
        result = 31 * result + (endnum != null ? endnum.hashCode() : 0);
        result = 31 * result + (single != null ? single.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
