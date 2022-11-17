/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sarabelen.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sarabelen.Entity.usuariosEntity;
import pe.com.sarabelen.Service.usuariosService;

/**
 *
 * @author sebas
 */
@RestController
@RequestMapping("/usuarios")
public class usuariosController {
    
    @Autowired
    private usuariosService service;
    
    @GetMapping
    public List<usuariosEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<usuariosEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<usuariosEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public usuariosEntity add(@RequestBody usuariosEntity u){
        return service.add(u);
    }
    @PutMapping("/{id}")
    public usuariosEntity update (@PathVariable Long id, @RequestBody usuariosEntity u){
        u.setId_usu(id);
        return service.update(u);
    }
    @DeleteMapping("/{id}")
    public usuariosEntity delete (@PathVariable Long id){
        usuariosEntity objc = new usuariosEntity();
        objc.setEstado(false);
        return service.delete(usuariosEntity.builder().id_usu(id).build());
    }
}
