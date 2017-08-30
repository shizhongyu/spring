package com.itheima.bos.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bc_decidedzone", schema = "ssh", catalog = "")
public class BcDecidedzone {
    private String id;
    private BcStaff staff;
    private String name;
    private Set subareas = new HashSet(0);

    public BcStaff getStaff() {
        return staff;
    }

    public void setStaff(BcStaff staff) {
        this.staff = staff;
    }

    public Set getSubareas() {
        return subareas;
    }

    public void setSubareas(Set subareas) {
        this.subareas = subareas;
    }

    public BcDecidedzone() {
    }

    public BcDecidedzone(String id, BcStaff staff, String name, Set subareas) {

        this.id = id;
        this.staff = staff;
        this.name = name;
        this.subareas = subareas;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BcDecidedzone that = (BcDecidedzone) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
