package com.itheima.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user", schema = "ssh", catalog = "")
public class TUser {
    private String id;
    private String username;
    private String password;
    private Double salary;
    private Date birthday;
    private String gender;
    private String station;
    private String telephone;
    private String remark;
    private Set noticebills = new HashSet(0);
    private Set roles = new HashSet(0);


    public TUser() {
    }

    public TUser(String id) {
        this.id = id;
    }

    public TUser(String id, String username, String password, Double salary, Date birthday, String gender, String station, String telephone, String remark, Set noticebills, Set roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.birthday = birthday;
        this.gender = gender;
        this.station = station;
        this.telephone = telephone;
        this.remark = remark;
        this.noticebills = noticebills;
        this.roles = roles;
    }

    public Set getNoticebills() {
        return noticebills;
    }

    public void setNoticebills(Set noticebills) {
        this.noticebills = noticebills;
    }

    public Set getRoles() {
        return roles;
    }

    public void setRoles(Set roles) {
        this.roles = roles;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salary")
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

        TUser user = (TUser) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (salary != null ? !salary.equals(user.salary) : user.salary != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        if (station != null ? !station.equals(user.station) : user.station != null) return false;
        if (telephone != null ? !telephone.equals(user.telephone) : user.telephone != null) return false;
        return remark != null ? remark.equals(user.remark) : user.remark == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (station != null ? station.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
