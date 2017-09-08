package com.itheima.bos.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "auth_role", schema = "ssh", catalog = "")
public class AuthRole {
    private String id;
    private String name;
    private String code;
    private String description;
    private Set functions = new HashSet(0);//当前角色对应的多个权限
    private Set users = new HashSet(0);//当前角色对应的多个用户

    public AuthRole() {
    }

    public AuthRole(String id) {
        this.id = id;
    }

    public AuthRole(String id, String name, String code, String description, Set functions, Set users) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.functions = functions;
        this.users = users;
    }

    public Set getFunctions() {
        return functions;
    }

    public void setFunctions(Set functions) {
        this.functions = functions;
    }

    public Set getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthRole authRole = (AuthRole) o;

        if (id != null ? !id.equals(authRole.id) : authRole.id != null) return false;
        if (name != null ? !name.equals(authRole.name) : authRole.name != null) return false;
        if (code != null ? !code.equals(authRole.code) : authRole.code != null) return false;
        if (description != null ? !description.equals(authRole.description) : authRole.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
