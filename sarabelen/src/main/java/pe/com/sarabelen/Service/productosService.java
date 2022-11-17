/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import pe.com.sarabelen.Entity.productosEntity;

/**
 *
 * @author RONALD
 */
public interface productosService {
     List<productosEntity> FindAll();
    List<productosEntity> FindAllCustom();
    Optional<productosEntity> findById(Long Id);
    productosEntity add (productosEntity p);
    productosEntity update (productosEntity p);
    productosEntity delete (productosEntity p);
}
