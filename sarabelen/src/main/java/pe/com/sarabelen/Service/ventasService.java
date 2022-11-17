/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import pe.com.sarabelen.Entity.ventasEntity;

/**
 *
 * @author Angel
 */
public interface ventasService {
    List<ventasEntity> FindAll();
    List<ventasEntity> FindAllCustom();
    Optional<ventasEntity> findById(Long Id);
    ventasEntity add (ventasEntity v);
    ventasEntity update (ventasEntity v);
    ventasEntity delete (ventasEntity v);
}
