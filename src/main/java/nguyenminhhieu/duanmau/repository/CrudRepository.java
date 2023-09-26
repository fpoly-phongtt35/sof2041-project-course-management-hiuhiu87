/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nguyenminhhieu.duanmau.repository;

import java.util.List;

/**
 *
 * @author Admin
 * @param <T>
 */
public interface CrudRepository<T,V> {
    
    public void save(T t);

    public void update(T t);

    public void delete(T t);

    public List<V> getAllResponse();
    
    public List<T> getAllTypeModel();
    
}
