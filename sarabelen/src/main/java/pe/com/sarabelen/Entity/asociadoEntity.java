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
@Entity(name="asociadoEntity")
@Table(name="asociados")
public class asociadoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_asociado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aso;
    @Column(name="nombre_asociado")
    private String  nom_aso;
    @Column(name="direc_asociado")
    private String dir_aso;
    @Column(name="est_asociado")
    private String est_aso;
    @Column(name="telf_asociado")
    private String tel_aso;
    @Column(name="estado")
    private boolean estado;
}
