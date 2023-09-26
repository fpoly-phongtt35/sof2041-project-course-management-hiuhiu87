/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenminhhieu.duanmau.service;

import java.util.List;
import nguyenminhhieu.duanmau.entity.Staff;
import nguyenminhhieu.duanmau.repository.StaffRepository;
import nguyenminhhieu.duanmau.request.LoginRequest;
import nguyenminhhieu.duanmau.response.StaffResponse;

/**
 *
 * @author Admin
 */
public class StaffService {

    private final StaffRepository repository = new StaffRepository();

    public List<StaffResponse> getAll() {
        return repository.getAllResponse();
    }

    public String addStaff(Staff staff) {
        if (staff.getStaffCode().trim().isEmpty()) {
            return "Mã Không Được Để Trống";
        }

        if (staff.getFullname().trim().isEmpty()) {
            return "Mã Không Được Để Trống";
        }

        if (staff.getPassword().trim().isEmpty()) {
            return "Mã Không Được Để Trống";
        }
        try {
            repository.save(staff);
            return "Thêm Thành Công";
        } catch (Exception e) {
            return "Thêm Không Thành Công";
        }

    }

    public String updateStaff(Staff staff) {
        if (staff != null) {
            if (staff.getStaffCode().trim().isEmpty()) {
                return "Mã Không Được Để Trống";
            }

            if (staff.getFullname().trim().isEmpty()) {
                return "Mã Không Được Để Trống";
            }

            if (staff.getPassword().trim().isEmpty()) {
                return "Mã Không Được Để Trống";
            }
            try {
                repository.update(staff);
                return "Sủa Thành Công";
            } catch (Exception e) {
                return "Sửa Không Thành Công";
            }
        } else {
            return "Không Tìm Được Nhân Viên";
        }

    }

    public String removeStaff(int index) {
        List<Staff> list = repository.getAllTypeModel();
        Staff staff = list.get(index);
        if (staff != null) {
            try {
                repository.delete(staff);
                return "Xóa Thành Công";
            } catch (Exception e) {
                return "Xóa Không Thành Công";
            }
        } else {
            return "Không Tìm Được Nhân Viên";
        }
    }
    
    public boolean login(LoginRequest loginRequest){
        String staffZCode = loginRequest.getStaffCode();
        Staff staff = repository.getInforByStaffCode(staffZCode);
        if (staff != null) {
            if (staff.getStaffCode().equals(loginRequest.getStaffCode()) && staff.getPassword().equals(loginRequest.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
}
