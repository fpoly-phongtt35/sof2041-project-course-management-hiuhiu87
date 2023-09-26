/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenminhhieu.duanmau.request;

/**
 *
 * @author Admin
 */
public class LoginRequest {
    
    private String staffCode;
    
    private String password;

    public LoginRequest(String staffCode, String password) {
        this.staffCode = staffCode;
        this.password = password;
    }

    public LoginRequest() {
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
    
}
