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
import pe.com.sarabelen.Entity.ventasEntity;
import pe.com.sarabelen.Repository.ventasRepository;

/**
 *
 * @author Angel
 */
@Service
public class ventasServiceImp implements ventasService{

    @Autowired
    private ventasRepository ventasrepository;
    
    @Override
    public List<ventasEntity> FindAll() {
        return ventasrepository.findAll();
    }

    @Override
    public List<ventasEntity> FindAllCustom() {
        return ventasrepository.findallCustome();
    }

    @Override
    public Optional<ventasEntity> findById(Long Id) {
        return ventasrepository.findById(Id);
    }

    @Override
    public ventasEntity add(ventasEntity v) {
        return ventasrepository.save(v);
    }

    @Override
    public ventasEntity update(ventasEntity v) {
        ventasEntity objv = ventasrepository.getById(v.getId_ven());
        BeanUtils.copyProperties(v, objv);
        return ventasrepository.save(objv);
    }

    @Override
    public ventasEntity delete(ventasEntity v) {
        ventasEntity objv = ventasrepository.getById(v.getId_ven());
        objv.setEstado(false);
        return ventasrepository.save(objv);    }

    
}
