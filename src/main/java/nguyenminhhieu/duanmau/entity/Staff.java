/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenminhhieu.duanmau.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "NHANVIEN")
public class Staff {
    
    @Id
    @Column(name = "MANV")
    private String staffCode;
    
    @Column(name = "MATKHAU")
    private String password;
    
    @Column(name = "HOTEN")
    private String fullname;
    
    @Column(name = "VAITRO")
    private Boolean role;

    public Staff(String staffCode, String password, String fullname, Boolean role) {
        this.staffCode = staffCode;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }
    
    public Staff(String password, String fullname, Boolean role) {
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }

    public Staff() {
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }
    
}
