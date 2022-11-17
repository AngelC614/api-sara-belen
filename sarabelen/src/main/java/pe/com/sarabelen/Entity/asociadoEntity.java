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
@Table(name="asociado")
public class asociadoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_asociado;
    @Column(name="nombre_asociado")
    private String  N_asoc;
    @Column(name="direc_asociado")
    private String D_asoc;
    @Column(name="est_asocaido")
    private String E_asoc;
    @Column(name="")
    private String telf_asociado;
    @Column(name="T_asoc")
    private boolean estado;
}
