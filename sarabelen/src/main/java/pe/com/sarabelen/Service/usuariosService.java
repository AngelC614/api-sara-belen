/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import pe.com.sarabelen.Entity.usuariosEntity;

/**
 *
 * @author sebas
 */
public interface usuariosService {
     List<usuariosEntity> FindAll();
    List<usuariosEntity> FindAllCustom();
    Optional<usuariosEntity> findById(Long Id);
    usuariosEntity add (usuariosEntity u);
    usuariosEntity update (usuariosEntity u);
    usuariosEntity delete (usuariosEntity u);
}
