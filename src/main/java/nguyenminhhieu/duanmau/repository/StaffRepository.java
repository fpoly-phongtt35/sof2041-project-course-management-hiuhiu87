/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenminhhieu.duanmau.repository;

import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import nguyenminhhieu.duanmau.config.HibernateUtil;
import nguyenminhhieu.duanmau.entity.Staff;
import nguyenminhhieu.duanmau.response.StaffResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class StaffRepository implements CrudRepository<Staff, StaffResponse>{

    private final Transaction transaction = null;

    @Override
    public void save(Staff staff) {
        try (Session session = HibernateUtil.getFactory().openSession()) {
            session.beginTransaction();
            session.persist(staff);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void update(Staff staff) {
        try (Session session = HibernateUtil.getFactory().openSession()) {
            session.beginTransaction();
            session.merge(staff);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void delete(Staff staff) {
        try (Session session = HibernateUtil.getFactory().openSession()) {
            session.beginTransaction();
            session.remove(staff);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public List<StaffResponse> getAllResponse() {
        try (Session session = HibernateUtil.getFactory().openSession()) {
            String sql = """
                        Select u from Staff u
                        """;
            List<StaffResponse> listResponse = new ArrayList<>();
            TypedQuery<Staff> query = session.createQuery(sql, Staff.class);
            List<Staff> list = query.getResultList();
            for (Staff staff : list) {
                StaffResponse staffResponse = new StaffResponse();
                staffResponse.setStaffCode(staff.getStaffCode());
                staffResponse.setPassword(staff.getPassword());
                staffResponse.setFullname(staff.getFullname());
                staffResponse.setRole(staff.getRole());
                listResponse.add(staffResponse);
            }
            return listResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Staff> getAllTypeModel() {
        try (Session session = HibernateUtil.getFactory().openSession()) {
            String sql = """
                        Select u from Staff u
                        """;
            TypedQuery<Staff> query = session.createQuery(sql, Staff.class);
            List<Staff> list = query.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Staff getInforByStaffCode(String staffCode){
        try (Session session = HibernateUtil.getFactory().openSession()) {
            Staff staff = session.get(Staff.class, staffCode);
            return staff;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
