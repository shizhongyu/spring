package com.itheima.bos.domain;

import javax.persistence.*;

@Entity
@Table(name = "bc_staff", schema = "ssh", catalog = "")
public class BcStaff {
    private String id;
    private String name;
    private String telephone;
    private String haspda = "0";
    private String deltag;
    private String station;
    private String standard;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "haspda")
    public String getHaspda() {
        return haspda;
    }

    public void setHaspda(String haspda) {
        this.haspda = haspda;
    }

    @Basic
    @Column(name = "deltag")
    public String getDeltag() {
        return deltag;
    }

    public void setDeltag(String deltag) {
        this.deltag = deltag;
    }

    @Basic
    @Column(name = "station")
    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Basic
    @Column(name = "standard")
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BcStaff bcStaff = (BcStaff) o;

        if (id != null ? !id.equals(bcStaff.id) : bcStaff.id != null) return false;
        if (name != null ? !name.equals(bcStaff.name) : bcStaff.name != null) return false;
        if (telephone != null ? !telephone.equals(bcStaff.telephone) : bcStaff.telephone != null) return false;
        if (haspda != null ? !haspda.equals(bcStaff.haspda) : bcStaff.haspda != null) return false;
        if (deltag != null ? !deltag.equals(bcStaff.deltag) : bcStaff.deltag != null) return false;
        if (station != null ? !station.equals(bcStaff.station) : bcStaff.station != null) return false;
        if (standard != null ? !standard.equals(bcStaff.standard) : bcStaff.standard != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (haspda != null ? haspda.hashCode() : 0);
        result = 31 * result + (deltag != null ? deltag.hashCode() : 0);
        result = 31 * result + (station != null ? station.hashCode() : 0);
        result = 31 * result + (standard != null ? standard.hashCode() : 0);
        return result;
    }
}
