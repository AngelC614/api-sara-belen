/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sarabelen.Entity.ventasEntity;

/**
 *
 * @author Angel
 */
public interface ventasRepository extends JpaRepository<ventasEntity, Long>{
    @Query("select v from ventasEntity v where v.estado=1")
    List<ventasEntity> findallCustome();
}
