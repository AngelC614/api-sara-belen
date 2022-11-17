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
import pe.com.sarabelen.Entity.rolEntity;
import pe.com.sarabelen.Repository.rolRepository;

/**
 *
 * @author arian
 */
@Service
public class rolServiceImp implements rolService {
    
    @Autowired
    private rolRepository  rolrepository;

    @Override
    public List<rolEntity> FindAll() {
        return rolrepository.findAll();
    }

    @Override
    public List<rolEntity> FindAllCustom() {
        return rolrepository.findallCustome();
    }

    @Override
    public Optional<rolEntity> findById(Long Id) {
        return rolrepository.findById(Id);
    }

    @Override
    public rolEntity add(rolEntity r) {
        return rolrepository.save(r);
    }

    @Override
    public rolEntity update(rolEntity r) {
        rolEntity objr = rolrepository.getById(r.getId_rol());
        BeanUtils.copyProperties(r, objr);
        return rolrepository.save(objr);
    }

    @Override
    public rolEntity delete(rolEntity r) {
    rolEntity objr =rolrepository.getById(r.getId_rol());
        objr.setEstado(false);
        return rolrepository.save(objr);    
    }
   
}
