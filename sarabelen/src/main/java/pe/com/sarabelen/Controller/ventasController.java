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
import pe.com.sarabelen.Entity.ventasEntity;
import pe.com.sarabelen.Service.ventasService;

/**
 *
 * @author Angel
 */
@RestController
@RequestMapping("/ventas")
public class ventasController {
    
    @Autowired
    private ventasService service;
    
    @GetMapping
    public List<ventasEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<ventasEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ventasEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public ventasEntity add(@RequestBody ventasEntity v){
        return service.add(v);
    }
    @PutMapping("/{id}")
    public ventasEntity update (@PathVariable Long id, @RequestBody ventasEntity v){
        v.setId_ven(id);
        return service.update(v);
    }
    @DeleteMapping("/{id}")
    public ventasEntity delete (@PathVariable Long id){
        ventasEntity objc = new ventasEntity();
        objc.setEstado(false);
        return service.delete(ventasEntity.builder().id_ven(id).build());
    }
}
