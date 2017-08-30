package com.itheima.bos.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bc_region", schema = "ssh", catalog = "")
public class BcRegion {
    private String id;
    private String province;
    private String city;
    private String district;
    private String postcode;
    private String shortcode;
    private String citycode;

    public BcRegion(String id, String province, String city, String district, String postcode, String shortcode, String citycode, Set subareas) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.district = district;
        this.postcode = postcode;
        this.shortcode = shortcode;
        this.citycode = citycode;
        this.subareas = subareas;
    }

    private Set subareas = new HashSet(0);

    public BcRegion() {
    }

    public BcRegion(String id) {
        this.id = id;
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
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "postcode")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "shortcode")
    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    @Basic
    @Column(name = "citycode")
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BcRegion bcRegion = (BcRegion) o;

        if (id != null ? !id.equals(bcRegion.id) : bcRegion.id != null) return false;
        if (province != null ? !province.equals(bcRegion.province) : bcRegion.province != null) return false;
        if (city != null ? !city.equals(bcRegion.city) : bcRegion.city != null) return false;
        if (district != null ? !district.equals(bcRegion.district) : bcRegion.district != null) return false;
        if (postcode != null ? !postcode.equals(bcRegion.postcode) : bcRegion.postcode != null) return false;
        if (shortcode != null ? !shortcode.equals(bcRegion.shortcode) : bcRegion.shortcode != null) return false;
        return citycode != null ? citycode.equals(bcRegion.citycode) : bcRegion.citycode == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (shortcode != null ? shortcode.hashCode() : 0);
        result = 31 * result + (citycode != null ? citycode.hashCode() : 0);
        return result;
    }
}
