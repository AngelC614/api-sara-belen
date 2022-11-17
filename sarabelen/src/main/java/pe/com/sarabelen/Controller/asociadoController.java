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
import pe.com.sarabelen.Entity.asociadoEntity;
import pe.com.sarabelen.Service.asociadoService;

/**
 *
 * @author pc
 */
@RestController
@RequestMapping("/asociado")
public class asociadoController {
    @Autowired
    private asociadoService service;
    
    @GetMapping
    public List<asociadoEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<asociadoEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<asociadoEntity> findById(@PathVariable Long id){
        return service.finById(id);
    }
    @PostMapping
    public asociadoEntity add(@RequestBody asociadoEntity a){
        return service.add(a);
    }
    @PutMapping("/{id}")
    public asociadoEntity update (@PathVariable Long id, @RequestBody asociadoEntity a){
        a.setId_aso(id);
        return service.update(a);
    }
    @DeleteMapping("/{id}")
    public asociadoEntity delete (@PathVariable Long id){
        asociadoEntity objc = new asociadoEntity();
        objc.setEstado(false);
        return service.delete(asociadoEntity.builder().id_aso(id).build());
    }
}
