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
import pe.com.sarabelen.Entity.usuariosEntity;
import pe.com.sarabelen.Entity.ventasEntity;
import pe.com.sarabelen.Repository.usuarioRepository;

/**
 *
 * @author sebas
 */
@Service
public class usuariosServiceImp implements usuariosService {
    
    @Autowired
    private usuarioRepository  usuariorepository;
    
    @Override
    public List<usuariosEntity> FindAll() {
        return usuariorepository.findAll();
    }

    @Override
    public List<usuariosEntity> FindAllCustom() {
         return usuariorepository.findallCustome();
    }

    @Override
    public Optional<usuariosEntity> findById(Long Id) {
        return usuariorepository.findById(Id);
    }

    @Override
    public usuariosEntity add(usuariosEntity u) {
        return usuariorepository.save(u);
    }

    @Override
    public usuariosEntity update(usuariosEntity u) {
        usuariosEntity obju = usuariorepository.getById(u.getId_usu());
        BeanUtils.copyProperties(u, obju);
        return usuariorepository.save(obju);
    }

    @Override
    public usuariosEntity delete(usuariosEntity u) {
        usuariosEntity obju = usuariorepository.getById(u.getId_usu());
        obju.setEstado(false);
        return usuariorepository.save(obju);    
    }
    
}
