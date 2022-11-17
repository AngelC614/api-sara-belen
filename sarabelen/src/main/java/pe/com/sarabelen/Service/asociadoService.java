/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import pe.com.sarabelen.Entity.asociadoEntity;

/**
 *
 * @author pc
 */
public interface asociadoService {
    List<asociadoEntity> FindAll();
    List<asociadoEntity> FindAllCustom();
    Optional<asociadoEntity> finById (long Id);
    asociadoEntity add (asociadoEntity a);
    asociadoEntity update (asociadoEntity a);
    asociadoEntity delete (asociadoEntity a);
}
