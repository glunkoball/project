package aaa.project.entity;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private Integer id;
    private String username;
    private String password ;
    private Integer r_id;
    private String roleStrs;
    private List<Role> roles = new ArrayList<Role>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getRoleStrs() {
        return roleStrs;
    }

    public void setRoleStrs(String roleStrs) {
        this.roleStrs = roleStrs;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
