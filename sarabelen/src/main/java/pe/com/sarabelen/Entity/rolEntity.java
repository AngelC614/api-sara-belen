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

/**
 *
 * @author arian
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="rolEntity")
@Table(name="rol")
public class rolEntity implements Serializable{
    @Id
    @Column(name="id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    @Column(name="nombre")
    private String nom_rol;
    @Column(name="estado")
    private boolean estado;
}
