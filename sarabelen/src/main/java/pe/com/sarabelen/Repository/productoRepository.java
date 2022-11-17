/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sarabelen.Entity.productosEntity;

/**
 *
 * @author RONALD
 */
public interface productoRepository extends JpaRepository<productosEntity, Long>{
      @Query("select p from productosEntity p where p.estado=1")
    List<productosEntity> findallCustome();
}
