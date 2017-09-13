package com.itheima.bos.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "auth_function", schema = "ssh", catalog = "")
public class AuthFunction {
    private String id;

    public String getpId(){
        if(parentFunction == null){
            return "0";
        }
        return parentFunction.getId();
    }

    public AuthFunction() {
    }

    public AuthFunction(String id) {
        this.id = id;
    }

    public AuthFunction(String id, AuthFunction parentFunction, String name, String code, String description, String page, String generatemenu, Integer zindex, Set roles, Set children) {
        this.id = id;
        this.parentFunction = parentFunction;
        this.name = name;
        this.code = code;
        this.description = description;
        this.page = page;
        this.generatemenu = generatemenu;
        this.zindex = zindex;
        this.roles = roles;
        this.children = children;
    }

    public AuthFunction getParentFunction() {
        return parentFunction;
    }

    public void setParentFunction(AuthFunction parentFunction) {
        this.parentFunction = parentFunction;
    }

    public Set getRoles() {
        return roles;
    }

    public void setRoles(Set roles) {
        this.roles = roles;
    }

    public Set getChildren() {
        return children;
    }

    public void setChildren(Set children) {
        this.children = children;
    }

    private AuthFunction parentFunction;//当前权限的上级权限
    private String name;
    private String code;
    private String description;
    private String page;
    private String generatemenu;
    private Integer zindex;
    private Set roles = new HashSet(0);//当前权限对应的多个角色
    private Set children = new HashSet(0);//当前权限的下级权限

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "page", nullable = true, length = 255)
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Basic
    @Column(name = "generatemenu", nullable = true, length = 255)
    public String getGeneratemenu() {
        return generatemenu;
    }

    public void setGeneratemenu(String generatemenu) {
        this.generatemenu = generatemenu;
    }

    @Basic
    @Column(name = "zindex", nullable = true)
    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthFunction that = (AuthFunction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (page != null ? !page.equals(that.page) : that.page != null) return false;
        if (generatemenu != null ? !generatemenu.equals(that.generatemenu) : that.generatemenu != null) return false;
        if (zindex != null ? !zindex.equals(that.zindex) : that.zindex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (generatemenu != null ? generatemenu.hashCode() : 0);
        result = 31 * result + (zindex != null ? zindex.hashCode() : 0);
        return result;
    }
}
