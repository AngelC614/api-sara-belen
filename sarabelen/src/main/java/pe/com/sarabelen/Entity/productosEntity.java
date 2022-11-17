/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sarabelen.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="productosEntity")
@Table(name="productos")
public class productosEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_prod")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    @Column(name="cantidad")
    private int Cantidad;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="imagen")
    private String imagen;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private double precio;
    @Column(name="estado")
    private boolean estado;
    
}
        
