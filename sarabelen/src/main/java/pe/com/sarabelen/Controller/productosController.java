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
import pe.com.sarabelen.Entity.productosEntity;
import pe.com.sarabelen.Service.productoServiceImp;

        
    @RestController
@RequestMapping("/productos")
public class productosController {

 
    @Autowired
    private productoServiceImp service;
    
    @GetMapping
    public List<productosEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<productosEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<productosEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public productosEntity add(@RequestBody productosEntity p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public productosEntity update (@PathVariable Long id, @RequestBody productosEntity p){
        p.setId_producto(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public productosEntity delete (@PathVariable Long id){
        productosEntity objp = new productosEntity();
        objp.setEstado(false);
        return service.delete(productosEntity.builder().id_producto(id).build());
        
    }
}

