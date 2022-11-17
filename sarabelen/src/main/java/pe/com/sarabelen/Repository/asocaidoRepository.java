/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sarabelen.Entity.asociadoEntity;

/**
 *
 * @author pc
 */
public interface asocaidoRepository extends JpaRepository<asociadoEntity, Long> {
    @Query("select a from asociadoEntity a where a.estado=1")
    List<asociadoEntity> findallCustome();
}
