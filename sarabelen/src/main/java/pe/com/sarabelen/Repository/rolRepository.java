/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sarabelen.Entity.rolEntity;
import pe.com.sarabelen.Entity.usuariosEntity;

/**
 *
 * @author arian
 */
public interface rolRepository extends JpaRepository<rolEntity, Long>{
    @Query("select r from rolEntity r where r.estado=1")
    List<rolEntity> findallCustome();
}
