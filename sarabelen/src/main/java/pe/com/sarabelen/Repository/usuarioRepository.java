/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sarabelen.Entity.usuariosEntity;
import pe.com.sarabelen.Entity.ventasEntity;

/**
 *
 * @author sebas
 */
public interface usuarioRepository extends JpaRepository<usuariosEntity, Long>{
    @Query("select u from usuariosEntity u where u.estado=1")
    List<usuariosEntity> findallCustome();
}
