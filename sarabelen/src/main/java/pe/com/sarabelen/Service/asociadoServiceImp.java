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
import pe.com.sarabelen.Entity.asociadoEntity;
import pe.com.sarabelen.Repository.asocaidoRepository;



/**
 *
 * @author pc
 */
@Service
public class asociadoServiceImp implements asociadoService {
    
    @Autowired
    private asocaidoRepository asocaidorepository;
    

    @Override
    public List<asociadoEntity> FindAll() {
        return asocaidorepository.findAll();
    }

    @Override
    public List<asociadoEntity> FindAllCustom() {
        return asocaidorepository.findallCustome();
    }

    @Override
    public Optional<asociadoEntity> finById(long Id) {
        return asocaidorepository.findById(Id);
    }

    @Override
    public asociadoEntity add(asociadoEntity a) {
        return asocaidorepository.save(a);
    }

    @Override
    public asociadoEntity update(asociadoEntity a) {
        asociadoEntity obja = asocaidorepository.getById(a.getId_asociado());
        BeanUtils.copyProperties(a, obja);
        return asocaidorepository.save(obja);
    }

    @Override
    public asociadoEntity delete(asociadoEntity a) {
        asociadoEntity obja = asocaidorepository.getById(a.getId_asociado());
        obja.setEstado(false);
        return asocaidorepository.save(obja);
    }


}
