/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import pe.com.sarabelen.Entity.rolEntity;
import pe.com.sarabelen.Entity.usuariosEntity;

/**
 *
 * @author arian
 */
public interface rolService {
     List<rolEntity> FindAll();
    List<rolEntity> FindAllCustom();
    Optional<rolEntity> findById(Long Id);
    rolEntity add (rolEntity r);
    rolEntity update (rolEntity r);
    rolEntity delete (rolEntity r);
}
