/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenminhhieu.duanmau.response;

/**
 *
 * @author Admin
 */
public class StaffResponse {
    
    private String staffCode;
    
    private String password;
    
    private String fullname;
    
    private Boolean role;

    public StaffResponse(String staffCode, String password, String fullname, Boolean role) {
        this.staffCode = staffCode;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }

    public StaffResponse() {
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

    @Override
    public String toString() {
        return "Staff Code: " + staffCode + " Password: " + password + "Full Name: " + fullname + "Role: " + role; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
