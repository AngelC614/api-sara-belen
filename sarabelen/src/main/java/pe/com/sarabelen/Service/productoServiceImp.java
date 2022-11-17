/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sarabelen.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sarabelen.Entity.productosEntity;
import pe.com.sarabelen.Repository.productoRepository;

/**
 *
 * @author RONALD
 */
@Service
public class productoServiceImp implements productosService{

    @Autowired
    private productoRepository productorepository;
    
    @Override
    public List<productosEntity> FindAll() {
        return productorepository.findAll();
    }

    @Override
    public List<productosEntity> FindAllCustom() {
       return productorepository.findallCustome();
    }

    @Override
    public Optional<productosEntity> findById(Long Id) {
        return productorepository.findById(Id);
    }

    @Override
    public productosEntity add(productosEntity p) {
        return productorepository.save(p);
    }

    @Override
    public productosEntity update(productosEntity p) {
        productosEntity objp = productorepository.getById(p.getId_producto());
        BeanUtils.copyProperties(p, objp);
        return productorepository.save(objp);
    }

    @Override
    public productosEntity delete(productosEntity p) {
        productosEntity objp = productorepository.getById(p.getId_producto());
       objp.setEstado(false);
        return productorepository.save(objp);
    }
    
}
