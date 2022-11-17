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
import pe.com.sarabelen.Entity.rolEntity;
import pe.com.sarabelen.Service.rolService;

/**
 *
 * @author arian
 */
@RestController
@RequestMapping("/roles")
public class rolController {
    @Autowired
    private rolService service;
    
    @GetMapping
    public List<rolEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<rolEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<rolEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public rolEntity add(@RequestBody rolEntity r){
        return service.add(r);
    }
    @PutMapping("/{id}")
    public rolEntity update (@PathVariable Long id, @RequestBody rolEntity r){
        r.setId_rol(id);
        return service.update(r);
    }
    @DeleteMapping("/{id}")
    public rolEntity delete (@PathVariable Long id){
        rolEntity objr = new rolEntity();
        objr.setEstado(false);
        return service.delete(rolEntity.builder().id_rol(id).build());
    }
}
